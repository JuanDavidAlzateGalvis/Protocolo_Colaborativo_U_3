/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller16.Ejercicio2;

/**
 *
 * @author juana
 */
public class GestorArchivo {
    
    private Almacenamiento almacenamiento;

    public GestorArchivo(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento; }
    
    public void guardar(String nombreArchivo, String contenido) {
        almacenamiento.guardarArchivo(nombreArchivo, contenido); }
    
    public String recuperar(String nombreArchivo) {
        return almacenamiento.recuperarArchivo(nombreArchivo); }
}
