package com.example.demo;

import java.util.List;
import java.util.Locale.Category;

import javax.sound.midi.Instrument;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer>, CrudRepository<Category, Integer> {
    
    List<Instrument> findByNombre(@Param("nombre") String nombre);

}
