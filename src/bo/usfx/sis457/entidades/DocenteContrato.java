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
public class DocenteContrato extends Docente {

    
    protected String Ncontrato;
    public DocenteContrato(String carnetIdentidad, String nombre, Calendar fechaNacimiento,int Aexperiencia,String Titulo,String [] asignatura,String Ncontrato){
        super(carnetIdentidad, nombre, fechaNacimiento,Aexperiencia,Titulo,asignatura);
        this.Ncontrato=Ncontrato;
    }
    public String getNcontrato() {
        return Ncontrato;
    }

    public void setNcontrato(String Ncontrato) {
        this.Ncontrato = Ncontrato;
    }
    public String toString() {
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Años de Experiencia=" + this.Aexperiencia + ", Titulo=" + this.Titulo 
                + ", Asignatura= ["+this.MostrarA()
                + "], Numero de Contrato="+ this.Ncontrato+ '}';
    }
}
