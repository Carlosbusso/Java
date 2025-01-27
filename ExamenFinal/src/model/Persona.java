/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Persona {
    String DNI;
    String nombres;
    Fecha fec_nac = new Fecha();
    String email;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Fecha getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Fecha fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(String DNI, String nombres) {
        this.DNI = DNI;
        this.nombres = nombres;
    }

    public Persona(String DNI, String nombres, Fecha fec_nac, String email) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.fec_nac = fec_nac;
        this.email = email;
    }
    
    public int getEdad(){
        return this.fec_nac.diferenciaFecha(new Fecha());
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombres=" + nombres + ", fec_nac=" + fec_nac + ", email=" + email + '}';
    }
    
    
}
