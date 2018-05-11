/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Docente extends Persona {
    protected int Aexperiencia;
    protected String[] asignatura;
    protected String Titulo;
 
    public Docente(String carnetIdentidad, String nombre, Calendar fechaNacimiento,int Aexp,String titulo,String[] asignatura) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Aexperiencia=Aexp;
        this.Titulo = titulo;
        this.asignatura=asignatura;
    }

    public Docente(int Aexp, String titulo,String[] asignatura) {
        this.Aexperiencia=Aexp;
        this.Titulo = titulo;
        this.asignatura=asignatura;
    }

    public Docente() {
        
    }
    public int getAexperiencia() {
        return Aexperiencia;
    }

    public void setAexperiencia(int experiencia) {
        this.Aexperiencia = experiencia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String[] getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String[] asignatura) {
        this.asignatura = asignatura;
    }
    public void ModA(int con,String ab){
        this.getAsignatura()[con]=ab;
    }
    public String MostrarA(){
        String cadena="";
        for(int i=0; i<this.getAsignatura().length; i++){
            cadena+="'"+this.getAsignatura()[i]+"'";
            if(i<(this.getAsignatura().length-1)){
                cadena+=",";
            }
        }
        return cadena;
    }
    @Override
    public String toString() {
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Contrato=" + Aexperiencia + ", Titulo=" + Titulo 
                + ", Asignatura=["+MostrarA()+"]"+ '}';
    }
    
}
