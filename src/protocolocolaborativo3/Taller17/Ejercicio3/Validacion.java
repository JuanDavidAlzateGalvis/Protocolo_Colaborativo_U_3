/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio3;

/**
 *
 * @author juana
 */
public class Validacion {
    
    public boolean validar(Usuario usuario) {
        return usuario.getUsername() != null && !usuario.getUsername().isEmpty() 
                && usuario.getPassword() != null && !usuario.getPassword().isEmpty();
    }
}
