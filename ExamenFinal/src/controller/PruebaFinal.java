/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.*;

/**
 *
 * @author carlo
 */
public class PruebaFinal {
    public static void main(String[] args) {
        
        
        ///////////////////////////////// PRUEBA CON DOCENTE APTO Y ALUMNO MAYOR DE 18 /////////////////////////////////////
        //Datos de curso y docente1
        Curso curso1 = new Curso(123, "Geometria Analitica", 7);
        Fecha fechaInicio1 = new Fecha(1,3,2025);
        Fecha fechaNacDocente1 = new Fecha(15,6,1969);
        Fecha fechaTiDocente1 = new Fecha(30,6,2005);
        Fecha fechaRegDocente1 = new Fecha(1,1,2015);
        Persona personaDoc1 = new Persona("12345678","Mauricio Lima",fechaNacDocente1, "limam@hotmail.com");
        Docente docente1 = new Docente(personaDoc1, "912345678", fechaTiDocente1,fechaRegDocente1);
        CursoAperturado cursoMatriculado = new CursoAperturado(curso1,123,docente1, fechaInicio1, 500);
        
        //Datos de Alumno1
        Fecha fechaNacAlumno1 = new Fecha(8,2,1997);
        Fecha fechaRegAlumno1 = new Fecha(1,1,2024);
        Persona pAlumno1 = new Persona("81234567","Carlos Evangelista",fechaNacAlumno1, "cevangelista@hotmail.com");
        Alumno alumno1 = new Alumno(pAlumno1, "999999999", fechaRegAlumno1);
        
        // Validación de docente para registrarse en CursoAperturado
        if (docente1.getTiempoExperiencia() >= curso1.getAños_experiencia()){
            System.out.println("El docente: " + docente1.getNombres() + " es apto para registro!");
        }
        else{
            System.out.println("Docente no apto para registro!");
        }
        
        // Validación de edad para alumno a matricularse
        if (alumno1.getEdad() >= 18){
            Matricula matricula1 = new Matricula( cursoMatriculado,  alumno1,  true);
            System.out.println("Detalles de la matrícula: " + matricula1.toString() + " del Alumno: " + pAlumno1.toString());
        }
        else {
            System.out.println("Solo se permite inscripción a mayores de 18 años!");
        }
        
        ///////////////////////////////// PRUEBA CON DOCENTE NO APTO Y ALUMNO MENOR DE 18 /////////////////////////////////////
        System.out.println("");
        
        //Datos de curso2 y docente2
        Curso curso2 = new Curso(123, "Robotica Avanzada", 10);
        Fecha fechaInicio2 = new Fecha(1,3,2025);
        Fecha fechaNacDocente2 = new Fecha(15,6,1980);
        Fecha fechaTiDocente2 = new Fecha(30,6,2017);
        Fecha fechaRegDocente2 = new Fecha(1,1,2020);
        Persona personaDoc2 = new Persona("12345633","Jose Fuentes",fechaNacDocente2, "jfuentes@hotmail.com");
        Docente docente2 = new Docente(personaDoc1, "912345633", fechaTiDocente2,fechaRegDocente2);
        CursoAperturado cursoMatriculado2 = new CursoAperturado(curso2,321,docente2, fechaInicio2, 500);
        
        //Datos de Alumno2
        Fecha fechaNacAlumno2 = new Fecha(3,7,2010);
        Fecha fechaRegAlumno2 = new Fecha(1,6,2024);
        Persona pAlumno2 = new Persona("81234567","Felipe Contreras",fechaNacAlumno2, "fcontreras@hotmail.com");
        Alumno alumno2 = new Alumno(pAlumno2, "999991234", fechaRegAlumno2);
        
        // Validación de docente para registrarse en CursoAperturado
        if (docente2.getTiempoExperiencia() >= curso2.getAños_experiencia()){
            System.out.println("El docente: " + docente1.getNombres() + " es apto para registro!");
        }
        else{
            System.out.println("Docente no apto para registro!");
        }
        
        // Validación de edad para alumno a matricularse
        if (alumno2.getEdad() >= 18){
            Matricula matricula2 = new Matricula( cursoMatriculado2,  alumno2,  true);
            System.out.println("Detalles de la matrícula: " + matricula2.toString() + " del Alumno: " + pAlumno2.toString());
        }
        else {
            System.out.println("Solo se permite inscripción a mayores de 18 años!");
        }
        
        
                
        
    }
}
