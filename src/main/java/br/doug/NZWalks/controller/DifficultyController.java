package br.doug.NZWalks.controller;

import br.doug.NZWalks.model.Difficulty;
import br.doug.NZWalks.service.DifficultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/api/difficulties")
public class DifficultyController {

    @Autowired
    private DifficultyService service;

    @GetMapping
    public ResponseEntity<List<Difficulty>> findAll(){

        return ResponseEntity.ok(service.findAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Difficulty> findById(@PathVariable UUID id){

        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Difficulty> create(@RequestBody Difficulty difficulty){

        return ResponseEntity.ok(service.create(difficulty));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable UUID id){

        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
