/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.matematica;

/**
 *
 * @author Martin
 */
public class Calculadora {
    //Atributos
    private int num1;
    private int num2;
    
    //Constructor vacio
    public Calculadora() {
    }
    //Constructor lleno
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //GETTERS y SETTERS
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int sumar() {
        int resultado;
        resultado = this.num1 + this.num2;
        return resultado;
    }
    
    public int restar() {
        int resultado;
        resultado = this.num1 - this.num2;
        return resultado;
    }
    
    public int multiplicar() {
        int resultado;
        resultado = this.num1 * this.num2;
        return resultado;
    }
    
    public float dividir() {
        float resultado;
        resultado = (float) this.num1 / this.num2;
        return resultado;
    }
}
