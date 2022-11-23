/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.services;

import java.util.List;
import com.tienda.tienda.entity.Persona;
/**
 *
 * @author Jorklin
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById(long id);
    public void savePersona(Persona persona);
    public void delete(long id);
    public Persona findByNombre (String nombre);
}
