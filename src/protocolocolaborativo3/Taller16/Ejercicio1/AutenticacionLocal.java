/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller16.Ejercicio1;

/**
 *
 * @author juana
 */
public class AutenticacionLocal implements ServicioAutenticacion {
    
    @Override
    public void autenticacion(String Usuario, int contraseña) {
        System.out.println("Autenticacion local del usuario: " + Usuario);
        System.out.println("Autenticacion local contrasena: " + contraseña);
    }
}
