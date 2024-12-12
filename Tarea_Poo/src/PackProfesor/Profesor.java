/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackProfesor;

import PackUniversidad.Persona;
import PackMaterias.Materias;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private List<Materias> materiasAsignadas;
    private double salario;

    public Profesor(String nombre, String apellido, double salario) {
        super(nombre, apellido);
        this.salario = salario;
        this.materiasAsignadas = new ArrayList<>();
    }

    public void asignarMateria(Materias materia) {
        materiasAsignadas.add(materia);
    }

    public void listarMaterias() {
        for (Materias materia : materiasAsignadas) {
            System.out.println(materia);
        }
    }

    public double calcularSalario() {
        return salario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombre + " " + apellido + ", Salario: " + salario);
    }

}
