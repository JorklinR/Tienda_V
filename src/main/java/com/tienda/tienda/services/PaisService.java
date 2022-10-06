/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.tienda.entity.Pais;
import com.tienda.tienda.repository.PaisRepository;
import java.util.List;

/**
 *
 * @author Jorklin
 */
@Service
public class PaisService implements IPaisService{
    
    @Autowired 
    private PaisRepository paisRepository ;

    @Override
    public List<Pais> listCountry() {
        
        return (List<Pais>)paisRepository.findAll(); 
        
    }
    
}
