package br.doug.NZWalks.service;

import br.doug.NZWalks.model.Region;
import br.doug.NZWalks.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RegionService {

    @Autowired
    private RegionRepository repository;

    public List<Region> findAll(){
        return repository.findAll();
    }

    public Region findById(UUID id){

        return repository.findById(id).orElseThrow(() -> new RuntimeException("Resource Region Not Found!"));

    }

    public Region create(Region region){

        return repository.save(region);
    }

    public Region update(UUID id, Region region){

        Region regionToBeUpdated = findById(id);

        regionToBeUpdated.setCode(region.getCode());
        regionToBeUpdated.setName(region.getName());
        regionToBeUpdated.setRegionImageUrl(region.getRegionImageUrl());

        return repository.save(regionToBeUpdated);

    }

    public void delete(UUID id){

        Region regionToBeDeleted = findById(id);

        repository.delete(regionToBeDeleted);

    }


}
