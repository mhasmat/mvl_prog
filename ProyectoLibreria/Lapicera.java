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
public class Lapicera {
    //ATRIBUTOS de la clase
    private String marca;
    private int modelo;
    private String color;

    //CONSTRUCTOR
    public Lapicera(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    //CONSTRUCTOR VACÍO
    public Lapicera() {
    }
    //Método GETTER para atributo 'marca'
    public String getMarca() {
        return marca;
    }
    //Método SETTER para atributo 'marca'
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //Método GETTER para atributo 'modelo'
    public int getModelo() {
        return modelo;
    }
    //Método SETTER para atributo 'modelo'
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    //Método GETTER para atributo 'color'
    public String getColor() {
        return color;
    }
    //Método SETTER para atributo 'color'
    public void setColor(String color) {
        this.color = color;
    }
    //Método propio
    public String mostrarPorPantalla() {
        return "Lapicera > Marca: "+marca+" - Modelo N°"+modelo+" - Color: "+color+" <<<";
    }

    //Método "toString" para visualizar por pantalla
    @Override
    public String toString() {
        return "Lapicera [" + "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ']';
    }
    
    
    
}
