/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio1;

/**
 *
 * @author juana
 */
public class GenerarReportes {
    
    public String generarReporte(Libro libro) {
        return "Titulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nPaginas: " + libro.getPaginas(); }
}
