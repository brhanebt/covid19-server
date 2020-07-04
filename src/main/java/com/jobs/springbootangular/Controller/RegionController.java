package com.jobs.springbootangular.Controller;

import com.jobs.springbootangular.Model.Region;
import com.jobs.springbootangular.Repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class RegionController {
    @Autowired
    private RegionRepository regionRepository;
    @GetMapping("/regions")
    public List<Region> getUsers(){
        return (List<Region>) regionRepository.findAll();
    }

    @PostMapping("/regions")
    void addUser(@RequestBody Region region){
        regionRepository.save(region);
    }
}
