/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PrimerCaso.controller;

import com.PrimerCaso.entity.Pelicula;
import com.PrimerCaso.entity.Sala;
import com.PrimerCaso.service.IPeliculaService;
import com.PrimerCaso.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author María José
 */
@Controller
public class PeliculaController {
      @Autowired
    private IPeliculaService peliculaService;
     @Autowired
     private ISalaService salaService;
     
     @GetMapping("/pelicula")
     public String index(Model model){
         List<Pelicula>listaPelicula=peliculaService.getAllPelicula();
         model.addAttribute("titulo","Tabla Peliculas");
         model.addAttribute("peliculas", listaPelicula);
         return "Peliculas";
     }
    @GetMapping("/peliculas")
    public String crearPelicula(Model model){
        List<Sala> listaPaises= salaService.listCountry();
        model.addAttribute("pelicula",new Pelicula());
         model.addAttribute("salas", listaPaises);
         return "crear"; 
    }
     @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula){
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }
     @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
        
    
   
    }
        @GetMapping("/editPelicula/{id}")
     public String editarPelicula(@PathVariable("id") Long idPelicula, Model model){
         Pelicula pelicula= peliculaService.getPeliculaById(idPelicula);
         List<Sala> listaSalas= salaService.listCountry();
         model.addAttribute("pelicula",pelicula);
         model.addAttribute("salas",listaSalas);
         return "crear";
        
    

     }
    
}
