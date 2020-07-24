/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medios_transporte;

/**
 *
 * @author Martin
 */
public class Auto extends Vehiculo {    //CLASE HIJA
    private String patente;
    private String modelo;
    private int anio;

    public Auto() {
    }

    public Auto(String patente, String modelo, int anio, int numSerie, String marca) {
        super(numSerie, marca);
        this.patente = patente;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
