/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Alumno extends Persona {
    protected String CarnetUniversitario;
    protected int Semestre;
    protected String[] asignaturaA;
    
    public Alumno(String carnetUniversitario, int semestre, String carnetIdentidad, String nombre, Calendar fechaNacimiento,String[] asignatura) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        this.asignaturaA=asignatura;
        //System.out.println("Se crea un Alumno");
    }
    
    public Alumno(String carnetUniversitario, int semestre,String[] asignatura) {
        super();
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        this.asignaturaA=asignatura;
        //System.out.println("Se crea un Alumno");
    }
    
    public String getCarnetUniversitario() {
        return CarnetUniversitario;
    }

    public void setCarnetUniversitario(String carnetUniversitario) {
        this.CarnetUniversitario = carnetUniversitario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        this.Semestre = semestre;
    }
    public String[] getAsignaturaA() {
        return asignaturaA;
    }

    public void setAsignaturaA(String[] asignaturaA) {
        this.asignaturaA = asignaturaA;
    }
    public String MostrarA(){
        String cadena="";
        for(int i=0; i<this.getAsignaturaA().length; i++){
            cadena+="'"+this.getAsignaturaA()[i]+"'";
            if(i<(this.getAsignaturaA().length-1)){
                cadena+=",";
            }
        }
        return cadena;
    }
    public void ModA(int con,String ab){
        this.getAsignaturaA()[con]=ab;
    }
    @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", CarnetUniversitario=" + this.CarnetUniversitario 
                + ", Semestre=" + this.Semestre +",Asignatura=["+MostrarA()
                +"]"+'}';
    }
}
