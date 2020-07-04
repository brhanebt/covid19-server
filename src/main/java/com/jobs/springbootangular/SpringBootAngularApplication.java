package com.jobs.springbootangular;

import com.jobs.springbootangular.Model.Region;
import com.jobs.springbootangular.Repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SpringBootAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAngularApplication.class, args);
    }

    @Bean
    CommandLineRunner init(RegionRepository regionRepository) {
        return args -> {
            long range = 1234567L;
            Random r = new Random();
            List<Region> regionList = new ArrayList<>();
            regionList.add(new Region(01L,"Tigray", 199,50, 0.1, 149L));
            regionList.add(new Region(02L,"Afar", 199,50, 0.1, 149L));
            regionList.add(new Region(03L,"Amhara", 199,50, 0.1, 149L));
            regionList.add(new Region(04L,"Oromia", 199,50, 0.1, 149L));
            regionList.add(new Region(05L,"Gambela", 199,50, 0.1, 149L));
            regionList.add(new Region(06L,"Somali", 199,50, 0.1, 149L));
            regionList.add(new Region(07L,"SNNP", 199,50, 0.1, 149L));
            regionList.add(new Region(8L,"Benshangul", 199,50, 0.1, 149L));
            regionList.add(new Region(9L,"Hareri", 199,50, 0.1, 149L));
            regionList.add(new Region(10L,"Addis Abeba", 1999,50, 0.1, 149L));
            regionList.add(new Region(11L,"Dire Dawa", 189,50, 0.1, 149L));

            regionList.stream().forEach(region -> regionRepository.save((Region) region));
            regionRepository.findAll().forEach(System.out::println);
        };
    }

}
