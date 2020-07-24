/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.geometria;

/**
 *
 * @author Martin
 */
public class Rectangulo {
    //Atributos de la clase Rectangulo
    private int base;
    private int altura;

    //Constructor (VACÍO)
    public Rectangulo() {
    }

    //Constructor (LLENO)
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //GETTER de base
    public int getBase() {
        return base;
    }
    //SETTER de base
    public void setBase(int base) {
        this.base = base;
    }
    //GETTER de altura
    public int getAltura() {
        return altura;
    }
    //SETTER de altura
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Cálculo del Área del Rectángulo
    public int areaRectangulo() {
        int resultado;
        resultado = this.base * this.altura;
        return resultado;
    }
    
    
}
