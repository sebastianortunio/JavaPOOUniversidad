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
 * @author Roger Laura
 */
public class DocenteTitular extends Docente {
    protected String ExamenC;

    
    public DocenteTitular(String carnetIdentidad, String nombre, Calendar fechaNacimiento,int Aexperiencia,String Titulo,String[] asignatura,String ExamenC){
        super(carnetIdentidad, nombre, fechaNacimiento,Aexperiencia,Titulo,asignatura);
        this.ExamenC=ExamenC;
    }
    public String getExamenC() {
        return ExamenC;
    }
    public void setExamenC(String examen){
        this.ExamenC=examen;
    }
    public String toString() {
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Años de Experiencia=" + this.Aexperiencia + ", Titulo=" + this.Titulo 
                +", Asignatura = ["+this.MostrarA() +"], Examen de competencia="+ this.ExamenC+ '}';
    }
}

