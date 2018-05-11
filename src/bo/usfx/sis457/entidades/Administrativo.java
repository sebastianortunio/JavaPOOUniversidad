/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

/**
 *
 * @author Marcelo
 */
import bo.usfx.sis457.Utilitarios;
import java.util.*;
public class Administrativo extends Persona{
    private String cargo;
    private String lugar;
    private Calendar FechaI;

   
    public Administrativo(String carnetIdentidad, String nombre, Calendar fechaNacimiento,String c,String l,Calendar FI){
        super(carnetIdentidad, nombre, fechaNacimiento);
        cargo=c;
        lugar=l;
        FechaI=FI;
    }
     public String getCargo() {
        return cargo;
    }

    public String getLugar() {
        return lugar;
    }

    public Calendar getFechaI() {
        return FechaI;
    }
     public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFechaI(Calendar FechaI) {
        this.FechaI = FechaI;
    }
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + this.cargo 
                + ", Lugar=" + this.lugar
                + ", Fecha de Ingreso="+Utilitarios.getFechaCalendario(this.FechaI)+'}';
    }
}
