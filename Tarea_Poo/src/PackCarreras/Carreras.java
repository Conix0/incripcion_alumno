/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackCarreras;

import java.util.ArrayList;
import java.util.List;

public class Carreras {
    private String nombre;
    private List<String> materias;
    private String director;

    public Carreras(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.materias = new ArrayList<>();
    }

    Carreras(String ingeniería_en_Software) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void agregarMateria(String materia) {
        materias.add(materia);
    }
 
    
    
    public void listarMaterias() {
        for (String materia : materias) {
            System.out.println(materia);
        }
    }

    public String buscarMateriaPorNombre(String nombre) {
        for (String materia : materias) {
            if (materia.equals(nombre)) {
                return materia;
            }
        }
        return null;
    }

    boolean getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
