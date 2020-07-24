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
public class Triangulo {
    //Atributos
    private double base;
    private double altura;
    
    //Constructor (VACIO)
    public Triangulo() {
    }
    
    //Constructor (LLENO)
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //GETTERS y SETTERS
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Método calcular área del triángulo
    public double areaTriangulo() {
        double resultado;
        resultado = (this.base * this.altura)/2;
        return resultado;        
    }
    
}
