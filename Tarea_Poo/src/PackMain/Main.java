/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackMain;
import PackAlumno.Alumno;
import PackUniversidad.universidadPrincipal;
import PackMaterias.Materias;

import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    private static final universidadPrincipal universidad = new universidadPrincipal("Universidad del Siglo XXI", "Dirección de la Universidad");
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú del Estudiante");
            System.out.println("1. Inscribirse en Materia");
            System.out.println("2. Listar Materias Inscriptas");
            System.out.println("3. Mostrar Notas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> inscribirseEnMateria(scanner);
                    case 2 -> listarMateriasInscriptas(scanner);
                    case 3 -> mostrarNotas(scanner);
                    case 4 -> salir = true;
                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número de la lista.");
                scanner.nextLine(); 
            } finally {
                
            }
        }

       
        scanner.close();
    }


    private static void inscribirseEnMateria(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese su número de DNI: ");
        String numeroMatricula = scanner.nextLine();
        Alumno alumno = new Alumno(nombre, apellido, numeroMatricula);

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.nextLine();
        Materias materia = universidad.buscarMateriaPorNombre(nombreMateria);
        guardarInformacionAlumnos();

        if (materia != null) {
            alumno.inscribirseEnMateria(materia);
            materia.agregarAlumno(alumno);
            System.out.println("Inscripción exitosa.");
        } else {
            System.out.println("Materia no encontrada.");
        }
    }

    private static void listarMateriasInscriptas(Scanner scanner) {
        System.out.print("Ingrese su número de matrícula: ");
        String numeroMatricula = scanner.nextLine();
        Alumno alumno = universidad.buscarAlumnoPorMatricula(numeroMatricula);

        if (alumno != null) {
            alumno.listarMateriasInscriptas();
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void mostrarNotas(Scanner scanner) {
        System.out.print("Ingrese su número de DNI: ");
        String numeroMatricula = scanner.nextLine();
        Alumno alumno = universidad.buscarAlumnoPorMatricula(numeroMatricula);

        if (alumno != null) {
            alumno.mostrarNotas();
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
     private static void guardarInformacionAlumnos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("alumnos.txt"))) {
            for (Alumno alumno : universidad.getAlumnos()) {
                writer.write(alumno.toString());
                writer.newLine();
            }
            System.out.println("Información de alumnos guardada correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la información de los alumnos.");
            e.printStackTrace();
        }
    }
    
     
}


    

