/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio1;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1");
        System.out.println("");
        
        Libro libro = new Libro("Pecados del ayer", "Edgar Poo", 2008);

        GenerarReportes gestorReportes = new GenerarReportes();
        String reporte = gestorReportes.generarReporte(libro);
        
        System.out.println("Reporte del libro");
        System.out.println(reporte);

        System.out.println("");
        GestorPersistencia gestorPersistencia = new GestorPersistencia();
        gestorPersistencia.guardarEnArchivo(libro, "libreria_pecadosdelayer.txt");
    }
}
