/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller15.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1");
        System.out.println("");
        
        double precio = 5600.00;
     
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(45);
        System.out.println("El descuento por porcentaje es: " + descuentoPorcentaje.calcularDescuento(precio));
 
        Descuento descuento = new DescuentoTotal(12000);
        System.out.println("El descuento fijo del producto es: " + descuento.calcularDescuento(precio));
    }
}
