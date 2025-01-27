/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class CursoAperturado extends Curso{
    int cod_curso_aperturado;
    Docente docente;
    Curso curso;
    Fecha fecha_inicio = new Fecha();
    int costo;
    
    public CursoAperturado(Curso c,
                 // información como CursoAperturado 
                int cod_curso_aperturado,Docente docente,  Fecha fecha_inicio, int costo) {
        super(c.cod_curso, c.nombre, c.años_experiencia);
        this.cod_curso_aperturado = cod_curso_aperturado;
        this.docente = docente;
        this.fecha_inicio = fecha_inicio;
        this.costo = costo;
    }
    
    public CursoAperturado(Curso c,
                 // información como CursoAperturado 
                int cod_curso_aperturado,Docente docente,  int costo) {
        super(c.cod_curso, c.nombre, c.años_experiencia);
        this.cod_curso_aperturado = cod_curso_aperturado;
        this.docente = docente;
        this.costo = costo;
    }

    public int getCod_curso_aperturado() {
        return cod_curso_aperturado;
    }

    public void setCod_curso_aperturado(int cod_curso_aperturado) {
        this.cod_curso_aperturado = cod_curso_aperturado;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Fecha getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Fecha fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "CursoAperturado{" + "cod_curso_aperturado=" + cod_curso_aperturado + ", fecha_inicio=" + fecha_inicio + ", costo=" + costo + '}';
    }
    
    
    
    
}
