/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Alumno;

/**
 *
 * @author carlo
 */
public class ArrayListEjemplo {
    public static void main(String[] args) {
        
        
    ArrayList lista;
    lista = new ArrayList();
    Alumno alu = new Alumno (5555, "ABEL ABAD", 2022);
    
    
    lista.add("Mensaje 1");
    lista.add("Mensaje 2");
    lista.add("Mensaje 3");
    lista.add("Mensaje 4");
    lista.add("Saludos");
    
    lista.add(alu);
    
    for(Object e: lista ){
        if(e instanceof Alumno){
            System.out.println((Alumno) e);
        }
        else {
            System.out.println((String) e);
        }

    }
    
    System.out.println("El indice 2 contiene: " + lista.get(2));
    lista.remove(alu);
    System.out.println("La lista con un elemento eliminado tiene " + lista.size() + " elementos");
    for(Object e: lista ){
        if(e instanceof Alumno){
            System.out.println((Alumno) e);
        }
        else {
            System.out.println((String) e);
        }

    }
    
    }
    
    
}
