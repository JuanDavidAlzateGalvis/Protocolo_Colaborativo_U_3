/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller14.Ejercicio1;

/**
 *
 * @author juana
 */
public class Circulo extends Figura {
    
    double radio;

    public Circulo(double radio) {
      this.radio = radio; }
    
    @Override
    public void calcularArea() {
        double area = 3.1415 * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}
