/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medios_transporte;

import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class Medios_transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo rod1 = new Vehiculo();
        rod1.setNumSerie(24688);
        rod1.setMarca("Velozz");
        Vehiculo rod2 = new Vehiculo(44438, "Two Wheels");
        
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Olmo");
        bici1.setNumSerie(1234);
        bici1.setTipo("Playera");
        bici1.setRodado(26);
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Raleigh");
        bici2.setTipo("Mountain Bike");
        bici2.setRodado(28);
        
        Moto mo1 = new Moto();
        mo1.setPatente("672KUS");
        mo1.setModelo("CG");
        mo1.setCilindrada(150);
        mo1.setMarca("Honda");
        mo1.setNumSerie(879555434);
        Moto mo2 = new Moto();
        mo2.setMarca("Yamaha");
        mo2.setModelo("YBR");
        mo2.setPatente("978LOL");
        mo2.setCilindrada(125);
        
        Auto au1 = new Auto();
        au1.setMarca("Peugeot");
        au1.setModelo("Partner");
        au1.setPatente("NAH743");
        au1.setAnio(2014);
        
        Auto lista_autos[] = new Auto[2];
        for (int i=0; i<2; i++) {
            String marca = JOptionPane.showInputDialog("Ingrese Marca del auto");
            String modelo = JOptionPane.showInputDialog("Ingrese Modelo del auto");
            String patente = JOptionPane.showInputDialog("Ingrese Patente del auto");
            int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de fabricación del auto"));
            int numSerie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N° de Serie del auto"));
            lista_autos[i] = new Auto(patente, modelo, anio, numSerie, marca);    
        }
        System.out.println("<<< OBJETOS DE TIPO VEHÍCULO >>>");
        System.out.printf("N°Serie: %d, Marca: %s \n", rod1.getNumSerie(), rod1.getMarca());
        System.out.printf("N°Serie: %d, Marca: %s \n\n", rod2.getNumSerie(), rod2.getMarca());
        
        System.out.println("<<< OBJETOS DE TIPO VEHÍCULO-Bicicleta >>>");
        System.out.printf("N°Serie: %d, Marca: %s, Tipo: %s, Rodado: %d \n", bici1.getNumSerie(), bici1.getMarca(), bici1.getTipo(), bici1.getRodado());
        System.out.printf("N°Serie: %d, Marca: %s, Tipo: %s, Rodado: %d \n\n", bici2.getNumSerie(), bici2.getMarca(), bici2.getTipo(), bici2.getRodado());
        
        System.out.println("<<< OBJETOS DE TIPO VEHÍCULO-Moto >>>");
        System.out.printf("N°Serie: %d, Marca: %s, Modelo: %s, Cilindrada: %d, Patente: %s \n", mo1.getNumSerie(), mo1.getMarca(), mo1.getModelo(), mo1.getCilindrada(), mo1.getPatente());
        System.out.printf("N°Serie: %d, Marca: %s, Modelo: %s, Cilindrada: %d, Patente: %s \n\n", mo2.getNumSerie(), mo2.getMarca(), mo2.getModelo(), mo2.getCilindrada(), mo2.getPatente());
        
        System.out.println("<<< OBJETOS DE TIPO VEHÍCULO-Auto >>>");
        System.out.printf("Marca: %s, Modelo: %s, Patente: %s, Año: %d, N°Serie: %d \n\n", au1.getMarca(), au1.getModelo(), au1.getPatente(), au1.getAnio(), au1.getNumSerie());
        
        System.out.println("<<< OBJETOS DE TIPO VEHÍCULO-Auto en la Lista de Autos >>>");
        for (int i=0; i<2; i++) {
            System.out.printf("Marca: %s, Modelo: %s, Patente: %s, Año: %d, N°Serie: %d \n", lista_autos[i].getMarca(), lista_autos[i].getModelo(), lista_autos[i].getPatente(), lista_autos[i].getAnio(), lista_autos[i].getNumSerie());
            
        }
        
    }
    
}
