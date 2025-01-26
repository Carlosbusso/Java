/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author carlo
 */
public class ArregloNumeros {
    
    public static void main(String[] args) {
        int n1[] = new int[5];
        
        for (int i = 0; i < n1.length; i++) {
            n1[i] = (i + 1) * 2; 
        }
        
        System.out.println("Valores del arreglo:");
        for (int i = 0; i < n1.length; i++) {
            System.out.print(n1[i] + " ");
        }
        System.out.println();
        
        // Calcular la suma y el promedio de los valores
        int suma = 0;
        for (int i = 0; i < n1.length; i++) {
            suma += n1[i];
        }
        
        System.out.println("Suma de los valores: " + suma);

        
    }
    
    
}
