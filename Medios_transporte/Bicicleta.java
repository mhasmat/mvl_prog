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
public class Bicicleta extends Vehiculo {   //CLASE HIJA
    private String tipo;
    private int rodado;

    public Bicicleta() {
    }

    //SUPER CONSTRUCTOR
    public Bicicleta(String tipo, int rodado, int numSerie, String marca) {
        super(numSerie, marca);
        this.tipo = tipo;
        this.rodado = rodado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRodado() {
        return rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }
    
    
}
