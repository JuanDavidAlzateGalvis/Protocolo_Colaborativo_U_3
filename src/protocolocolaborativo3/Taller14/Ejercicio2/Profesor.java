/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller14.Ejercicio2;

/**
 *
 * @author juana
 */
public class Profesor extends Persona{
    
    String nombre;
    String color;
    
    public Profesor(String nombre, String color) {  
        this.nombre = nombre ;
        this.color = color;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi color favorito es: " + color);
        System.out.println("Soy el profesor");
    }     
}
