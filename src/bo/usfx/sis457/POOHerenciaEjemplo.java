/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas = new ArrayList<>();
        String a[]={"FISICA","ECONOMIA"};
        personas.add(new Alumno("35-1", 1,a));
        personas.add(new DocenteTitular("222222", "Juan Perez", new GregorianCalendar(1980, 11,01),1, "Licenciado en Informática",a,"examen de mesa"));
        personas.add(new Alumno("35-2", 1,a));
        personas.add(new Alumno("35-3", 1,a));
        personas.add(new Docente(2, "Ingeniero de Sistemas",a));
        personas.add(new Alumno("35-4", 1,a));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Docentes                           |");
        System.out.println("| 3) Gestión de Alumnos                            |");
        System.out.println("| 4) Gestión de Admistrativos                      |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocente();
                break;
            case "3":
                menuAlumnos();
                break;
            case "4":
                menuAdministrativo();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuDocente() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docente                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("+==================================================+");
        System.out.println("| 2) Gestion Docentes Titular                      |");
        System.out.println("| 3) Gestion Docentes Con Contrato                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentes();
                volverMenu();
                menuDocente();
                break;
            case "2":
                menuDocentesTitular();
                break;
            case "3":
                menuDocentesConContrato();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuDocentesTitular() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes Titulares                     |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docente                                 |");
        System.out.println("| 2) Añadir Docente                                 |");
        System.out.println("| 3) Modificar Docente                              |");
        System.out.println("| 4) Borrar Docente                                 |");
        System.out.println("| 0) Volver al Menú Principal                       |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentesTitulares();
                volverMenu();
                menuDocentesTitular();
                break;
            case "2":
                anadirDocenteTitular();
                volverMenu();
                menuDocentesTitular();
                break;
            case "3":
                modificarDocenteTitular();
                volverMenu();
                menuDocentesTitular();
                break;
            case "4":
                borrarDocenteTitular();
                volverMenu();
                menuDocentesTitular();
                break;
            default:
                menuDocente();
        }
    }
    public static void menuDocentesConContrato() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes con Contrato                 |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docentes                               |");
        System.out.println("| 2) Añadir Docentes                               |");
        System.out.println("| 3) Modificar Docentes                            |");
        System.out.println("| 4) Borrar Docentes                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocentesContarto();
                volverMenu();
                menuDocentesConContrato();
                break;
            case "2":
                anadirDocenteConCOntrato();
                volverMenu();
                menuDocentesConContrato();
                break;
            case "3":
                modificarDocenteConContrato();
                volverMenu();
                menuDocentesConContrato();
                break;
            case "4":
                borrarDocenteconContrato();
                volverMenu();
                menuDocentesConContrato();
                break;
            default:
                menuDocente();
        }
    }
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Añadir Alumnos                                |");
        System.out.println("| 2) Listar Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    public static void menuAdministrativo() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Admistrativo                          |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Añadir Administrativo                         |");
        System.out.println("| 2) Listar Administrativo                         |");
        System.out.println("| 3) Modificar Admistrativo                        |");
        System.out.println("| 4) Borrar Administrativo                         |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                anadirAdministrativo();
                volverMenu();
                menuAdministrativo();
                break;
            case "2":
                listarAdministrativo();
                volverMenu();
                menuAdministrativo();
                break;
            case "3":
                modificarAlministrativo();
                volverMenu();
                menuAdministrativo();;
                break;
            case "4":
                borrarAdministrativo();
                volverMenu();
                menuAdministrativo();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarDocentes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof Docente) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    public static void listarDocentesTitulares() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof DocenteTitular) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    public static void listarDocentesContarto() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof DocenteContrato) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    /*public static void anadirProfesor() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        int Aexp;
        String titulo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Profesor                                  |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Contrato: ");
            Aexp = Integer.valueOf(entradaTeclado.readLine());
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente(carnetIdentidad, nombre, fechaNacimientoCalendario,Aexp, titulo));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }*/
    //añadiendo docente Titular
    public static void anadirDocenteTitular(){
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        int Aexp;
        String titulo;
        String examen;
        
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                   |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Anos de experinecia: ");
            Aexp = Integer.valueOf(entradaTeclado.readLine());
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Cantidad de Asigatura: ");
            int CA=Integer.valueOf(entradaTeclado.readLine());
            String asigna;
            String[] asignaturaT=new String[CA];
            System.out.print("Introduzca La asignatura: \n");
            for(int i=0; i<CA; i++){
                System.out.print((i+1)+" = ");
                asigna=entradaTeclado.readLine();
                asignaturaT[i]=asigna;
            }
            System.out.print("Examen de competencia: ");
            examen=entradaTeclado.readLine();
            //String[] asignaturaT={"Calulo","Fisica","Algebra"}; prueba
            personas.add(new DocenteTitular(carnetIdentidad, nombre, fechaNacimientoCalendario,Aexp, titulo,asignaturaT,examen));
            System.out.println("Registro de Docente Titular completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void anadirDocenteConCOntrato(){
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        int Aexp;
        String titulo;
        String contrato;
        //String[] asignaturaC={"Calulo","Fisica","Economia"};
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                   |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Anos de experinecia: ");
            Aexp = Integer.valueOf(entradaTeclado.readLine());
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Cantidad de Asigatura: ");
            int CA=Integer.valueOf(entradaTeclado.readLine());
            String asigna;
            String[] asignaturaC=new String[CA];
            System.out.print("Introduzca La asignatura: \n");
            for(int i=0; i<CA; i++){
                System.out.print((i+1)+" = ");
                asigna=entradaTeclado.readLine();
                asignaturaC[i]=asigna;
            }
            System.out.print("Examen de competencia: ");
            contrato=entradaTeclado.readLine();
            personas.add(new DocenteContrato(carnetIdentidad, nombre, fechaNacimientoCalendario,Aexp, titulo,asignaturaC,contrato));
            System.out.println("Registro de Docente con Contrato completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    /*public static void modificarProfesor() {
        int id;
        Docente docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Profesor                               |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Profesor a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docente = (Docente)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docente.getCarnetIdentidad()+ "': ");
                docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docente.getNombre() + "': ");
                docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docente.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Contrato '" + docente.getAexperiencia()+ "': ");
                docente.setAexperiencia(Integer.valueOf(entradaTeclado.readLine()));
                System.out.print("Introduzca el Título Universitario: ");
                docente.setTitulo(entradaTeclado.readLine());
                personas.set(id, docente);
                System.out.println("Registro de Profesor modificado!");
            } else {
                System.out.println("El Registro de Profesor no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }*/
    public static void modificarDocenteTitular() {
        int id;
        DocenteTitular docenteT;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente Titular                        |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Profesor a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteT = (DocenteTitular)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docenteT.getCarnetIdentidad()+ "': ");
                if(entradaTeclado.readLine().equals("")){
                    docenteT.setCarnetIdentidad(docenteT.getCarnetIdentidad());
                }else{
                    docenteT.setCarnetIdentidad(entradaTeclado.readLine());
                }
                System.out.print("Modificar el Nombre '" + docenteT.getNombre() + "': ");
                docenteT.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteT.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteT.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Años de Experiencia '" + docenteT.getAexperiencia()+ "': ");
                docenteT.setAexperiencia(Integer.valueOf(entradaTeclado.readLine()));
                System.out.print("Modificar el Titulo Universitario: '"+docenteT.getTitulo()+"': ");
                docenteT.setTitulo(entradaTeclado.readLine());
                
                int op;
                do{
                    System.out.print("ASIGNATURA: \n         1)Modificar\n         2)aumentar\n         3)Mantener\n Opcion: ");
                    op=Integer.valueOf(entradaTeclado.readLine());
                    switch(op){
                        case 1:
                            for(int con=0; con<docenteT.getAsignatura().length; con++){
                                System.out.print("  '"+docenteT.getAsignatura()[con]+"': ");
                                String as=entradaTeclado.readLine();
                                docenteT.ModA(con, as);
                            }
                            break;
                        case 2:
                            int pos=docenteT.getAsignatura().length;
                            String[] asignat=new String[pos+1];
                            for(int i=0; i<docenteT.getAsignatura().length; i++){
                                 asignat[i]=docenteT.getAsignatura()[i];
                                }
                            System.out.print("Insertar Asignatura: ");
                             String A1=entradaTeclado.readLine();
                             asignat[pos]=A1;
                             docenteT.setAsignatura(asignat);
                            break;
                    }
                }while(op<=2);
                
                
                
                
                System.out.print("Modificar el Examen de competencia '"+docenteT.getExamenC()+"': ");
                docenteT.setExamenC(entradaTeclado.readLine());
                personas.set(id, docenteT);
                System.out.println("Registro de Profesor modificado!");
            } else {
                System.out.println("El Registro de Profesor no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void modificarDocenteConContrato() {
        int id;
        DocenteContrato docenteC;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente con Contrato                   |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteC = (DocenteContrato)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docenteC.getCarnetIdentidad()+ "': ");
                docenteC.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docenteC.getNombre() + "': ");
                docenteC.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteC.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteC.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Años de Experiencia '" + docenteC.getAexperiencia()+ "': ");
                docenteC.setAexperiencia(Integer.valueOf(entradaTeclado.readLine()));
                System.out.print("Modificar el Titulo Universitario: '"+docenteC.getTitulo()+"': ");
                docenteC.setTitulo(entradaTeclado.readLine());
                
                
                int op;
                do{
                    System.out.print("ASIGNATURA: \n         1)Modificar\n         2)aumentar\n         3)Mantener\n Opcion: ");
                    op=Integer.valueOf(entradaTeclado.readLine());
                    switch(op){
                        case 1:
                            for(int con=0; con<docenteC.getAsignatura().length; con++){
                                System.out.print("  '"+docenteC.getAsignatura()[con]+"': ");
                                String as=entradaTeclado.readLine();
                                docenteC.ModA(con, as);
                            }
                            break;
                        case 2:
                            int pos=docenteC.getAsignatura().length;
                            String[] asignat=new String[pos+1];
                            for(int i=0; i<docenteC.getAsignatura().length; i++){
                                 asignat[i]=docenteC.getAsignatura()[i];
                                }
                            System.out.print("Insertar Asignatura: ");
                             String A1=entradaTeclado.readLine();
                             asignat[pos]=A1;
                             docenteC.setAsignatura(asignat);
                            break;
                    }
                }while(op<=2);

                System.out.print("Modificar el Numero de contrato '"+docenteC.getNcontrato()+"': ");
                docenteC.setNcontrato(entradaTeclado.readLine());
                personas.set(id, docenteC);
                System.out.println("Registro de Profesor modificado!");
            } else {
                System.out.println("El Registro de Profesor no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void borrarDocenteTitular() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente Titular                                  |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Cocente borrado!");
            } else {
                System.out.println("El Registro de docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void borrarDocenteconContrato() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente Con Contrato                       |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    /*public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }*/
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    /*public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Alumno(carnetUniversitario, semestre, carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }*/
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        int semestre;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            System.out.print("Introduzca el Cantidad de Asigatura: ");
            int CA=Integer.valueOf(entradaTeclado.readLine());
            String asigna;
            String[] asigA=new String[CA];
            System.out.print("Introduzca La asignatura: \n");
            for(int i=0; i<CA; i++){
                System.out.print((i+1)+" = ");
                asigna=entradaTeclado.readLine();
                asigA[i]=asigna;
            }
            
            personas.add(new Alumno(carnetUniversitario, semestre, carnetIdentidad, nombre, fechaNacimientoCalendario,asigA));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Modificar el semestre: "+alumno.getSemestre()+"': ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                int op;
                do{
                    System.out.print("ASIGNATURA: \n         1)Modificar\n         2)aumentar\n         3)Mantener\n Opcion: ");
                    op=Integer.valueOf(entradaTeclado.readLine());
                    switch(op){
                        case 1:
                            for(int con=0; con<alumno.getAsignaturaA().length; con++){
                                System.out.print("  '"+alumno.getAsignaturaA()[con]+"': ");
                                String as=entradaTeclado.readLine();
                                alumno.ModA(con, as);
                            }
                            break;
                        case 2:
                            int pos=alumno.getAsignaturaA().length;
                            String[] asignat=new String[pos+1];
                            for(int i=0; i<alumno.getAsignaturaA().length; i++){
                                 asignat[i]=alumno.getAsignaturaA()[i];
                                }
                            System.out.print("Insertar Asignatura: ");
                             String A1=entradaTeclado.readLine();
                             asignat[pos]=A1;
                             alumno.setAsignaturaA(asignat);
                            break;
                    }
                }while(op<=2);
                personas.set(id, alumno);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    //ADMINISTRATIVO
     public static void listarAdministrativo() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona admi: personas) {
            if (admi instanceof Administrativo) {
                i++;
                System.out.println(i + ": " + admi);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
     public static void anadirAdministrativo() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String cargo;
        String lugar;
        String fechaI;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el cargo: ");
            cargo = entradaTeclado.readLine();
            System.out.print("Introduzca el Lugar: ");
            lugar = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Ingreso (ejemplo: 1980-01-01): ");
            fechaI = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaI);
            Calendar fechaIngresoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaIngresoDate);
            personas.add(new Administrativo(carnetIdentidad, nombre, fechaNacimientoCalendario,cargo,lugar,fechaIngresoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
     public static void modificarAlministrativo() {
        int id;
        Administrativo Admi;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                Admi = (Administrativo)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + Admi.getCarnetIdentidad()+ "': ");
                Admi.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + Admi.getNombre() + "': ");
                Admi.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(Admi.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                Admi.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Cargo '" + Admi.getCargo() + "': ");
                Admi.setCargo(entradaTeclado.readLine());
                System.out.print("Introduzca el Lugar: ");
                Admi.setLugar(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(Admi.getFechaI()) + "': ");
                Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaIngresoCalendario = Calendar.getInstance();
                fechaIngresoCalendario.setTime(fechaIngresoDate);
                Admi.setFechaNacimiento(fechaIngresoCalendario);
                personas.set(id, Admi);
                System.out.println("Registro de Administrativo modificado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void borrarAdministrativo() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Administrativo                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrativo a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Administrativo borrado!");
            } else {
                System.out.println("El Registro de Administrativo no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

