/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio2;

/**
 *
 * @author juana
 */
public class CalcularPrecio  {
    
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto()); }
}
