package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;

    @OneToMany(targetEntity = Instrument.class, mappedBy = "category")
    @OrderBy("nombre ASC")
    private Set<Instrument> instruments = new HashSet<Instrument>();

    public Set<Instrument> getCursos() {
        return instruments;
    }
    public void setCursos(Set<Instrument> instruments) {
        this.instruments = instruments;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
