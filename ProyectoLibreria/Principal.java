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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("<<<< LIBRERIA MVL >>>>");
        System.out.println("----------------------");
        Lapicera lapi1 = new Lapicera("Bic", 3, "Azul");
        Lapicera lapi2 = new Lapicera("Faber Castell", 32, "Azul");
        //Lapicera lapi3 = new Lapicera("Pilot", 15, "Negro");
        System.out.println(lapi1.toString());
        System.out.println(lapi2.toString());
        
        Lapicera lapi3 = new Lapicera();
        lapi3.setMarca("Pilot");
        lapi3.setModelo(78);
        lapi3.setColor("Rojo");        
        //System.out.println(lapi3.toString());
        System.out.println("Lapicera Marca: "+lapi3.getMarca());
        System.out.println("         Modelo: "+lapi3.getModelo());
        System.out.println("         Color: "+lapi3.getColor());
        System.out.println("------------------------------------------------------------------------");
        System.out.println(lapi1.mostrarPorPantalla());
        System.out.println(lapi2.mostrarPorPantalla());
        System.out.println(lapi3.mostrarPorPantalla());
        System.out.println("------------------------------------------------------------------------");
        
        //Instanciar 3 objetos Regla
        Regla regla1 = new Regla();
        Regla regla2 = new Regla();
        Regla regla3 = new Regla();
        
        //Settear cada objeto Regla
        regla1.setMarca("Pizzini");
        regla1.setLongitud(50);
        regla1.setMaterial("Plástico");                
        regla2.setMarca("Maped");
        regla2.setLongitud(30);
        regla2.setMaterial("Madera");        
        regla3.setMarca("MIT");
        regla3.setLongitud(100);
        regla3.setMaterial("Metal");
        
        //Mostrar los objetos Regla por pantalla
        System.out.println(regla1.mostrarPorPantalla());
        System.out.println(regla2.mostrarPorPantalla());
        System.out.println(regla3.mostrarPorPantalla());        
        System.out.println("________________________________________________________________________");
        
    }
    
}
