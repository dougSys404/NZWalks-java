package br.doug.NZWalks.service;

import br.doug.NZWalks.model.Difficulty;
import br.doug.NZWalks.repository.DifficultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@Service
public class DifficultyService {

    @Autowired
    private DifficultyRepository repository;

    public List<Difficulty> findAll(){

        return repository.findAll();
    }

    public Difficulty findById(UUID id){

        return repository.findById(id).orElseThrow(() -> new RuntimeException("Resource Difficulty not found!"));
    }

    public Difficulty create(Difficulty difficulty){

        return repository.save(difficulty);
    }

    public void delete(@PathVariable UUID id) {

        Difficulty difficultyToBeDeleted = findById(id);

        repository.delete(difficultyToBeDeleted);

    }

}
