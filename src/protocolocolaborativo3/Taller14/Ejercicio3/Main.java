/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller14.Ejercicio3;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 3");
        System.out.println("");
        
        Animal animal = new Perro(); 
        animal.hacerSonido(); 

        //animal.correr(); 
        
        Animal miGato = new Gato();
        miGato.hacerSonido();
    }
}

