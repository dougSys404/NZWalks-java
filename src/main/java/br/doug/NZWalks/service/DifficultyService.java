package br.doug.NZWalks.service;

import br.doug.NZWalks.model.Difficulty;
import br.doug.NZWalks.repository.DifficultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DifficultyService {

    @Autowired
    private DifficultyRepository repository;

    public List<Difficulty> findAll(){

        return repository.findAll();
    }

}
