/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerCaso.service;

import com.PrimerCaso.entity.Sala;
import com.PrimerCaso.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author María José
 */
@Service
public class SalaService implements ISalaService {
     @Autowired
   private SalaRepository salaRepository;
   @Override
   public List<Sala>listCountry(){
       return (List<Sala>)salaRepository.findAll();}
}
