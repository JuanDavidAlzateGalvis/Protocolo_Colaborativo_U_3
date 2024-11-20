/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolocolaborativo3.Taller15.Ejercicio2;

/**
 *
 * @author juana
 */
public class Main {
    
    public static void main(String[] args) {
   
        System.out.println("Ejercicio 2");
        System.out.println("");
        
        GestorDocumento gestor = new GestorDocumento();

        Documento pdf = new Pdf();
        gestor.documentar(pdf, "EXPORTANDO DOCUMETO PDF");

        Documento word = new Word();
        gestor.documentar(word, "EXPORTANDO DOCUMENTO WORD");
    }
}
