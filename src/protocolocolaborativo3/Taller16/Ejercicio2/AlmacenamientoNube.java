/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller16.Ejercicio2;

/**
 *
 * @author juana
 */
public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Guardando '" + nombreArchivo + "' en la nube con contenido: " + contenido); }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        return "Recuperando '" + nombreArchivo + "' desde la nube."; }
}
