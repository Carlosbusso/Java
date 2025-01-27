/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Matricula{
    boolean pagado;
    Fecha fecha_pago = new Fecha();
    Alumno alumno;
    CursoAperturado cursoMatriculado;
    
    public Matricula(CursoAperturado cursoMatriculado, Alumno alumno, boolean pagado) {
        this.cursoMatriculado = cursoMatriculado;
        this.alumno = alumno;
        this.pagado = pagado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Fecha getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Fecha fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public CursoAperturado getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(CursoAperturado cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return "Matricula{" + "pagado=" + pagado + ", fecha_pago=" + fecha_pago + ", cursoMatriculado=" + cursoMatriculado + '}';
    }

    
}
