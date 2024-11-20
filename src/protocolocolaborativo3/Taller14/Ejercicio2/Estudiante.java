/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller14.Ejercicio2;

/**
 *
 * @author juana
 */
public class Estudiante extends Persona {
    
    String nombre;
    int edad;
    
    public Estudiante(String nombre, int edad) {
      this.nombre = nombre ;
      this.edad = edad;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);
        System.out.println("Soy el estudiante");
    }
}
