/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller16.Ejercicio1;

/**
 *
 * @author juana
 */
public class AutenticacionOAuth implements ServicioAutenticacion {
     
    @Override
    public void autenticacion(String Usuario, int contraseña) {
        System.out.println("Autenticacion OAuth del usuario: " + Usuario);
        System.out.println("Autenticacion OAuth contraseña: " + contraseña);  
    }
}
