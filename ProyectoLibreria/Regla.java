/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.proyectolibreria;

/**
 *
 * @author Martin
 */
public class Regla {
    //ATRIBUTOS
    private String marca;
    private int longitud;
    private String material;
    
    //CONSTRUCTOR (lleno)
    public Regla(String marca, int longitud, String material) {
        this.marca = marca;
        this.longitud = longitud;
        this.material = material;
    }
    
    //CONSTRUCTOR (vacío)
    public Regla() {
    }
    
    //Métodos GETTERS y SETTERS (para todos los atributos)
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    
    //Método de la clase para mostrar los atributos por pantalla
    public String mostrarPorPantalla() {
        return "Regla > Marca: "+marca+" - Largo: "+longitud+"cms. - Material: "+material+" <<<";
    }
    
}
