/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipaje;

/**
 *
 * @author catalina
 */
public class Equipaje {

    private int id;
    private String nombrePropietario;
    private double peso;
    private double costo;
  
      public Equipaje(int id, String nombrePropietario, double peso, double costo) {
        this.id = id;
        this.nombrePropietario = nombrePropietario;
        this.peso = peso;
        this.costo = costo;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the nombrePropietario
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * @param nombrePropietario the nombrePropietario to set
     */
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
}
