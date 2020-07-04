package com.jobs.springbootangular.Repository;

import com.jobs.springbootangular.Model.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {

}
