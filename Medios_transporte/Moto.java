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
public class Moto extends Vehiculo {    //CLASE HIJA
    private String patente;
    private String modelo;    
    private int cilindrada;

    public Moto() {
    }

    //SUPER CONSTRUCTOR
    public Moto(String patente, String modelo, int cilindrada, int numSerie, String marca) {
        super(numSerie, marca);
        this.patente = patente;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
