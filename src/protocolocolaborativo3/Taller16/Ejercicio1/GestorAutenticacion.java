/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller16.Ejercicio1;

/**
 *
 * @author juana
 */
public class GestorAutenticacion {
    
    private ServicioAutenticacion servicioAutenticacion;
    
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion; }
    
    public void gestorAutenticacion(String Usuario, int contraseña) {
        servicioAutenticacion.autenticacion(Usuario, contraseña); }
}
