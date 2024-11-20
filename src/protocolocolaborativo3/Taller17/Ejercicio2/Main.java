/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 2");
        System.out.println("");
        
        Producto producto = new Producto("Celular de alta calidad", 5500000.0, 0.06);

        CalcularPrecio calculadora = new CalcularPrecio();
        GenerarEtiqueta generador = new GenerarEtiqueta(calculadora);

        System.out.println("Precio final: " + calculadora.calcularPrecioFinal(producto));
        System.out.println(generador.generarEtiqueta(producto));
    }
}
