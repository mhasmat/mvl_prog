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
public class Vehiculo { //CLASE MADRE
    private int numSerie;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(int numSerie, String marca) {
        this.numSerie = numSerie;
        this.marca = marca;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
