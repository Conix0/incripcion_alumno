/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackMaterias;

import PackAlumno.Alumno;
import PackProfesor.Profesor;
import java.util.ArrayList;
import java.util.List;

public class Materias {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;
    private String horarios;
     
    public Materias(String nombre,String horarios) {
        this.nombre = nombre;
        this.horarios = horarios;
        this.alumnos = new ArrayList<>();
        
        }
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void listarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarHorarios() {
        System.out.println(horarios);
    }
    
     public String getNombre() {
        return nombre;
    }
    
}
   
