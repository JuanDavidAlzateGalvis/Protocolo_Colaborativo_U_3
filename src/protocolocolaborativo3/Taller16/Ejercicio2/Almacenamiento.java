/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package protocolocolaborativo3.Taller16.Ejercicio2;

/**
 *
 * @author juana
 */
public interface Almacenamiento {
    
    void guardarArchivo(String nombreArchivo, String contenido);
    String recuperarArchivo(String nombreArchivo); 
    
}
