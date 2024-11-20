/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller14.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
     
        System.out.println("Ejercicio 1");
        System.out.println("");
    
        Figura circulo = new Circulo(12);
        circulo.calcularArea();
     
        Figura rectangulo = new Rectangulo(10, 15);
        rectangulo.calcularArea();
    }
}
