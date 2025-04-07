package br.doug.NZWalks.repository;

import br.doug.NZWalks.model.Difficulty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DifficultyRepository extends JpaRepository<Difficulty, UUID> {
}
