/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller15.Ejercicio1;

/**
 *
 * @author juana
 */
public class DescuentoPorcentaje extends Descuento {
    
    double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje; }
    
    @Override
    public double calcularDescuento(double precio) {
      return (precio * porcentaje) / 100; }
}
