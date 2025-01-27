/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Fecha;

/**
 *
 * @author carlo
 */
public class PruebaFecha {
    public static void main(String[] args) {
        // Fecha actual
        Fecha a = new Fecha();
        // Fechas cualquiera
        Fecha b = new Fecha(16, 1, 2025);
        Fecha c = new Fecha(26, 1, 2024);

        System.out.println("La diferencia entre " + a.toString() + " y " + b.toString() + " es: " + a.diferenciaFecha(b) + " años");
        System.out.println("La diferencia entre " + c.toString() + " y " + b.toString() + " es: " + c.diferenciaFecha(b) + " años");
        System.out.println("La diferencia entre " + a.toString() + " y " + c.toString() + " es: " + c.diferenciaFecha(a) + " años");
    }
}
