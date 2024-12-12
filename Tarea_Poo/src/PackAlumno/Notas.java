/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackAlumno;
import java.util.Scanner;

public class Notas { 

    static Scanner evaluarNota;
      
    public void evaluarNota(Scanner scanner) {
        System.out.print("Ingresa tu nota del parcial: ");
        
        // Leer la nota ingresada por el usuario
        double nota = scanner.nextDouble();
        
        // Evaluar la nota
        if (nota >= 5) {
            System.out.println("¡Aprobaste! Tu nota es: " + nota);
        } else {
            System.out.println("Desaprobaste. Tu nota es: " + nota);
        }
    }
    
}
