package br.doug.NZWalks.controller;

import br.doug.NZWalks.model.Difficulty;
import br.doug.NZWalks.service.DifficultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/api/difficulties")
public class DifficultyController {

    @Autowired
    private DifficultyService service;

    @GetMapping
    public ResponseEntity<List<Difficulty>> findAll(){

        return ResponseEntity.ok(service.findAll());

    }
}
