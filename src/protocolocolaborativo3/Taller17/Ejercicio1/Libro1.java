/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller17.Ejercicio1;

/**
 *
 * @author juana
 */
public class Libro1 {
    
    public class Libro {
        private String titulo;
        private String autor;
        private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public String getTitulo() {
        return titulo; }
    
    public String getAutor() {
        return autor; }
    
    public int getPaginas() {
        return paginas; }
    
    public String generarReporte() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nPaginas: " + paginas; }
    
    public void guardarEnArchivo() {
        System.out.println("Guardando informacion del libro en un archivo..."); }
    }    
}
