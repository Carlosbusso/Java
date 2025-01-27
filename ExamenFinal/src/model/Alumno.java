/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Fecha;

/**
 *
 * @author carlo
 */
public class Alumno extends Persona{
    
    Fecha fec_registro = new Fecha();
    boolean alumno_vigente;
    String telefono;
    
    public Alumno(Persona p,
                 // información como Alumno 
                String telefono, Fecha fec_registro) {
        super(p.DNI, p.nombres, p.fec_nac, p.email);
        this.fec_registro = fec_registro;
        this.alumno_vigente = true;
        this.telefono = telefono;
    }
    
    public Alumno(Persona p) {
        super(p.DNI, p.nombres, p.fec_nac, p.email);
        this.alumno_vigente = true;
    }

    public Fecha getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public boolean isAlumno_vigente() {
        return alumno_vigente;
    }

    public void setAlumno_vigente(boolean alumno_vigente) {
        this.alumno_vigente = alumno_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public int getAntiguedad(){
        return this.fec_registro.diferenciaFecha(new Fecha());
    }

    @Override
    public String toString() {
        return "Alumno{" + "fec_registro=" + fec_registro + ", alumno_vigente=" + alumno_vigente + ", telefono=" + telefono + '}';
    }
    
    
    
}
