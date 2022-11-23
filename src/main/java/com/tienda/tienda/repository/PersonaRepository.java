/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.repository;

/**
 *
 * @author Jorklin
 */
import com.tienda.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{

    public Persona findByNombre(String nombre);
    

}
