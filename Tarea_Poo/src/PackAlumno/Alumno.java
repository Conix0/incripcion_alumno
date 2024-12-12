/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackAlumno;

import PackUniversidad.Persona;
import PackMaterias.Materias;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Alumno extends Persona {
    
   protected String nombre;
   protected String apellido;
    protected String NumeroDNI;
    protected String numeroMatricula;
    private Notas notas;
    protected List<Materias> materiasInscriptas;

    public Alumno(String nombre, String apellido, String numerodni) {
        super(nombre, apellido);
        this.NumeroDNI = numerodni;
        this.notas = new Notas();
        this.materiasInscriptas = new ArrayList<>();
    }

    public void inscribirseEnMateria(Materias materia) {
        materiasInscriptas.add(materia);
    }

    public void listarMateriasInscriptas() {
        for (Materias materia : materiasInscriptas) {
            System.out.println(materia);
        }
    }

    public void mostrarNotas() {
        System.out.println("Notas del alumno: " + nombre + " " + apellido );
        notas.evaluarNota(new Scanner(System.in));
       
    }

    
    public String getNumeroMatricula() {
        return numeroMatricula;
    }
   
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //menu de alumno
        System.out.print("Ingresa el nombre del alumno: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresa el apellido del alumno: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingresa el número de DNI: ");
        String numerodni = scanner.nextLine();
        
        Alumno alumno = new Alumno(nombre, apellido, numerodni);
        
        alumno.mostrarNotas(); 
       
        
        scanner.close();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Alumno: " + nombre + " " + apellido + ", Número de DNI: " + numeroMatricula);
    }

   
    

}

 
    



   

    
    

