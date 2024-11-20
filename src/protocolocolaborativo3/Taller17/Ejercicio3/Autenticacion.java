/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio3;

/**
 *
 * @author juana
 */
public class Autenticacion {
    
    public boolean autenticar(Usuario usuario, String password) {
        return usuario.getPassword().equals(password); }
}
