/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.matematica;

import javax.swing.JOptionPane; //importamos la biblioteca JOptionPane

/**
 *
 * @author Martin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showConfirmDialog(null, usuario+" ¿Es correcto?");
        JOptionPane.showMessageDialog(null, "¡Hola "+usuario+"!");
        
        System.out.println("¡Hola "+usuario+"!");        
        System.out.println("***********************************");
        System.out.println("*** BIENVENIDO A LA CALCULADORA ***");
        System.out.println("***********************************");
        
        String dato1 = JOptionPane.showInputDialog("Ingrese 1er número");
        int numero1 = Integer.parseInt(dato1);
        String dato2 = JOptionPane.showInputDialog("Ingrese 2do número");
        int numero2 = Integer.parseInt(dato2);
        
        //Instanciamos el objeto calcu, y le pasamos los nros del usuario como parámetros
        Calculadora calcu = new Calculadora(numero1, numero2);
        
        System.out.println("Los números son:");
        System.out.println("Num 1: "+calcu.getNum1()+" >< Num 2: "+calcu.getNum2());
        System.out.println("-----------------------------------");
        System.out.println("SUMA = "+calcu.sumar());
        System.out.println("RESTA = "+calcu.restar());
        System.out.println("MULTIPLICACIÓN = "+calcu.multiplicar());
        System.out.print("DIVISIÓN = ");        
        
        if(calcu.dividir() == Float.POSITIVE_INFINITY || calcu.dividir() == Float.NEGATIVE_INFINITY){
            System.out.println("¡¡¡ERROR!!! Revise su ingreso.");
        }else{
            System.out.println(calcu.dividir());
        }
    }

}
