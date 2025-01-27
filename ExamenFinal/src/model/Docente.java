/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Docente extends Persona{
    
    Fecha fec_registro = new Fecha();
    Fecha fec_titulacion = new Fecha();
    boolean docente_vigente;
    String telefono; 
    
    
    public Docente(Persona p,
                 // información como Docente 
                String telefono, Fecha fec_titulacion, Fecha fec_registro) {
        super(p.DNI, p.nombres, p.fec_nac, p.email);
        this.docente_vigente = true;
        this.fec_titulacion = fec_titulacion;
        this.fec_registro = fec_registro;
        this.telefono = telefono;
    }
    
    public Docente(Persona p) {
        super(p.DNI, p.nombres, p.fec_nac, p.email);
        this.docente_vigente = true;
    }

    public Fecha getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public Fecha getFec_titulacion() {
        return fec_titulacion;
    }

    public void setFec_titulacion(Fecha fec_titulacion) {
        this.fec_titulacion = fec_titulacion;
    }

    public boolean isDocente_vigente() {
        return docente_vigente;
    }

    public void setDocente_vigente(boolean docente_vigente) {
        this.docente_vigente = docente_vigente;
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
    
    public int getTiempoExperiencia(){
        return this.fec_titulacion.diferenciaFecha(new Fecha());
    }

    @Override
    public String toString() {
        return "Docente{" + "fec_registro=" + fec_registro + ", fec_titulacion=" + fec_titulacion + ", docente_vigente=" + docente_vigente + ", telefono=" + telefono + '}';
    }
    
    
    
}
