package br.doug.NZWalks.controller;

import br.doug.NZWalks.model.Region;
import br.doug.NZWalks.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/api/regions")
public class RegionController {

    @Autowired
    private RegionService service;

    @GetMapping
    public ResponseEntity<List<Region>> findAll(){

        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Region> findById(@PathVariable UUID id){

        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Region> create(@RequestBody Region region){

        return ResponseEntity.ok(service.create(region));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Region> update(@PathVariable UUID id, @RequestBody Region region){

        Region updatedRegion = service.update(id, region);

        return ResponseEntity.ok(updatedRegion);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable UUID id){

        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
