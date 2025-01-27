/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Fecha {
    int dia_int = 0;
    int mes_int = 0;
    int año_int = 0;
    int hora = 0;
    int min = 0;
    int seg = 0;
    String fecha_actual;

    public Fecha() {
        this.dia_int = 26;
        this.mes_int = 1;
        this.año_int = 2025;
        fecha_actual = this.dia_int + "/" + this.mes_int + "/" + this.año_int;
    }

    
    public Fecha(int dia_int, int mes_int, int año_int) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
        fecha_actual = this.dia_int + "/" + this.mes_int + "/" + this.año_int;
    }

    public Fecha(int dia_int, int mes_int, int año_int, int hora, int min, int seg) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
        this.hora = hora;
        this.min = min;
        this.seg = seg;
        fecha_actual = this.dia_int + "/" + this.mes_int + "/" + this.año_int + " " +  this.hora + ":" + this.min + ":" + this.seg;
    }

    public String getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(String fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public int getDia_int() {
        return dia_int;
    }

    public void setDia_int(int dia_int) {
        this.dia_int = dia_int;
    }

    public int getMes_int() {
        return mes_int;
    }

    public void setMes_int(int mes_int) {
        this.mes_int = mes_int;
    }

    public int getAño_int() {
        return año_int;
    }

    public void setAño_int(int año_int) {
        this.año_int = año_int;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    @Override
    public String toString() {
        return "Fecha:  " + dia_int + "/" + mes_int + "/" + año_int + " " + hora + ":" + min + ":" + seg;
    }
    
    // Da la diferencia solo en años aproximado, se puedo 365 dias por año  y 30 dias por mes
    public int diferenciaFecha(Fecha b){
        return Math.abs((this.getAño_int()*365- b.getAño_int()*365) + (this.getMes_int()*30- b.getMes_int()*30) + (this.getDia_int()- b.getDia_int()))/360;
    }
}
