package com.jobs.springbootangular.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    @Id
    private Long id;
    private String name;
    private Integer cases;
    private Integer recovered;
    private Double countryPercentage;
    private Long activeCases;

}
