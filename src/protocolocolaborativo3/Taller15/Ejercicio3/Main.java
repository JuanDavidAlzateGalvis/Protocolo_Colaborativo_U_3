/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller15.Ejercicio3;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 3");
        System.out.println("");
        
        GestorMensajero gestor = new GestorMensajero();

        Mensajero email = new Email();
        gestor.notificar(email, "Mensaje enviado por email.");

        Mensajero sms = new Sms();
        gestor.notificar(sms, "Mensaje enviado por SMS.");

        Mensajero push = new NotificacionPush();
        gestor.notificar(push, "Mensaje enviado por push.");
    }
}
