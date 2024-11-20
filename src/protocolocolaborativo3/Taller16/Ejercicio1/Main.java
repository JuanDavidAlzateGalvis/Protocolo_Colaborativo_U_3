/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller16.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1");
        System.out.println("");
        
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(autenticacionLocal);
        gestorAutenticacion.gestorAutenticacion("Alzate", 18945);
    }
}
