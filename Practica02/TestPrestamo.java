/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Prestamo;

/**
 *
 * @author carlo
 */
public class TestPrestamo {
    
    public static void main(String[] args) {
        Prestamo p1 = new Prestamo("Revista", "R0001", "Carlos Evangelista");
        Prestamo p2 = new Prestamo("Libro", "L0001", "Jorge Manrique");
        Prestamo p3 = new Prestamo("Revista", "R0002", "Juan Tito");
        p1.setFechaDevolucion("2025-13-01T13:30:52.123Z");
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        
    }
    
}
