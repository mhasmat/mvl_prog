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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4,3);
        System.out.println("Los datos del Rectángulo r1 son:");
        System.out.println("Base = "+r1.getBase()+" cms.");
        System.out.println("Altura = "+r1.getAltura()+" cms.");
        System.out.println("El Área del Rectángulo es: "+r1.areaRectangulo()+" cms.");
        /*r1.setAltura(2);
        System.out.println("Los datos del rectangulo r1 son:");
        System.out.println("Base = "+r1.getBase());
        System.out.println("Altura = "+r1.getAltura());*/
        System.out.println("________________________________________________");
        Triangulo t1 = new Triangulo();
        t1.setBase(7.27);
        t1.setAltura(9.45);
        System.out.println("Los datos del Triángulo son:");
        System.out.println("Base = "+t1.getBase()+" cms.");
        System.out.println("Altura = "+t1.getAltura()+" cms.");
        System.out.println("El Área del Triángulo es: "+t1.areaTriangulo()+" cms.");
        
    }
    
}
