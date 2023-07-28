package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "instrument", path = "instrument")
public interface InstrumentRepository extends PagingAndSortingRepository<Instrument, Integer>, CrudRepository<Instrument, Integer> {
    
    List<Instrument> findByNombre(@Param("nombre") String nombre);

}
