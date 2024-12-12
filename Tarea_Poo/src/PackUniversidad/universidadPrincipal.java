/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackUniversidad;

import PackAlumno.Alumno;

import PackProfesor.Profesor;

import PackMaterias.Materias;
import java.util.ArrayList;
import java.util.List;


public class universidadPrincipal {
    private String nombre;   
    private List<Materias> materias;
    private List<Profesor> profesores;
    private List<Alumno> alumnos;
   

    public universidadPrincipal(String nombre, String direccion) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
       
        this.profesores = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

   

    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

   
    

    public void mostrarInformacion() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Profesores:");
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
        System.out.println("Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public Materias buscarMateriaPorNombre(String nombre) {
     for (Materias materia : materias) {
            if (materia.getNombre().equals(nombre)) {
                return materia;
            }
        }
        return null;
    }
    
    public Alumno buscarAlumnoPorMatricula(String numeroMatricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNumeroMatricula().equals(numeroMatricula)) {
                return alumno;
            }
        }
        return null;
    }
     public List<Alumno> getAlumnos() {
        return alumnos;
    }

}
