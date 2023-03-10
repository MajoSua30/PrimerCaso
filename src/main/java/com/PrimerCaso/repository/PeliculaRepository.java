/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PrimerCaso.repository;

import com.PrimerCaso.entity.Pelicula;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author María José
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {
    
}
