/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Curso {
    int cod_curso;
    String nombre;
    boolean curso_vigente;
    int años_experiencia;

    public Curso(int cod_curso, String nombre, int años_experiencia) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.años_experiencia = años_experiencia;
        this.curso_vigente = true;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCurso_vigente() {
        return curso_vigente;
    }

    public void setCurso_vigente(boolean curso_vigente) {
        this.curso_vigente = curso_vigente;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    @Override
    public String toString() {
        return "Curso{" + "cod_curso=" + cod_curso + ", nombre=" + nombre + ", curso_vigente=" + curso_vigente + ", a\u00f1os_experiencia=" + años_experiencia + '}';
    }
    
    
    
    
    
    
}
