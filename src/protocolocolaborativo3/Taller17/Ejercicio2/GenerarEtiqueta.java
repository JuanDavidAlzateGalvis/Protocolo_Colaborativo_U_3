/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio2;

/**
 *
 * @author juana
 */
public class GenerarEtiqueta {
    
    private CalcularPrecio calculadora;

    public GenerarEtiqueta(CalcularPrecio calculadora) {
        this.calculadora = calculadora; }

    public String generarEtiqueta(Producto producto) {
        double precioFinal = calculadora.calcularPrecioFinal(producto);
        return "Producto: " + producto.getNombre() + ", Precio: " + precioFinal;
    }
}
