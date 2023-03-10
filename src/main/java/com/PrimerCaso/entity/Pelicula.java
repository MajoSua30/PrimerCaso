
package com.PrimerCaso.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author María José
 */
@Entity
@Table(name="peliculas")
public class Pelicula implements Serializable {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String nombres;
    private int costo;
    private String fecha;
    private int salamuestra;
   
    @ManyToOne
    @JoinColumn(name="salas_id")
    private Sala salas;  

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getSalamuestra() {
        return salamuestra;
    }

    public void setSalamuestra(int salamuestra) {
        this.salamuestra = salamuestra;
    }

    public Sala getSalas() {
        return salas;
    }

    public void setSalas(Sala salas) {
        this.salas = salas;
    }

 
    
}
