/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller15.Ejercicio3;

/**
 *
 * @author juana
 */
public class NotificacionPush extends Mensajero {
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Notificacion push: " + mensaje); }
}
