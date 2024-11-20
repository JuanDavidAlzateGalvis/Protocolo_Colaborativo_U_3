/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio3;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 3");
        System.out.println("");
        
        Usuario usuario = new Usuario("Juan Alzate", "contrasena2004");
        Validacion validacion = new Validacion();
        
        if (validacion.validar(usuario)) {
            Autenticacion autenticacion = new Autenticacion();
            if (autenticacion.autenticar(usuario, "contrasena2004")) {
                System.out.println("Autenticacion exitosa.");
            } else {
                System.out.println("Autenticacion fallida. Datos invalidos.");
            }
        }
    }
}
