/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.Instant;

/**
 *
 * @author carlo
 */
public class Prestamo {
    private int codigoPrestamo;
    private String tipoMaterial; //revista o libro
    private String codigoMaterial;
    private String nombreUsuarioPrestamo;
    private String fechaPrestamo;
    private String fechaDevolucion;
    static private int correlativo= 0; 
    


    public Prestamo(String tipoMaterial, String codigoMaterial, String nombreUsuarioPrestamo) {
        this.correlativo++;
        this.tipoMaterial = tipoMaterial;
        this.codigoMaterial = codigoMaterial;
        this.nombreUsuarioPrestamo = nombreUsuarioPrestamo;
        this.codigoPrestamo = this.correlativo;
        fechaPrestamo = Instant.now().toString();
    }
    

    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getCodigoMaterial() {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public String getNombreUsuarioPrestamo() {
        return nombreUsuarioPrestamo;
    }

    public void setNombreUsuarioPrestamo(String nombreUsuarioPrestamo) {
        this.nombreUsuarioPrestamo = nombreUsuarioPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    public void mostrar(){
        System.out.println("Codigo Prestamo: " + codigoPrestamo);
        System.out.println("Tipo Material:  " + tipoMaterial);
        System.out.println("Codigo Material:  " + codigoMaterial);
        System.out.println("Nombre Usuario al cual se prestó: " + nombreUsuarioPrestamo);
        System.out.println("Fecha Prestamo: " + fechaPrestamo);
        System.out.println("Fecha Devolución: " + fechaDevolucion);
        
   }
    
    
    
}
