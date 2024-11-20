/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller14.Ejercicio2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
    
        System.out.println("Ejercicio 2");
        System.out.println("");
    
        Persona estudiante = new Estudiante("Juan Alzate", 17);
        estudiante.presentarse();
     
        Persona profesor = new Profesor("Jhon Arrieta", "Rojo");
        System.out.println("");
        profesor.presentarse();
    }
}
