/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackCarreras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrerasArraylist {
    private String nombre;

    // Constructor que acepta solo el nombre
    public CarrerasArraylist (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public static void main(String[] args) {
        
        List<Carreras> listaCarreras = new ArrayList<>();

        listaCarreras.add(new Carreras("Ingeniería en Software"));
        listaCarreras.add(new Carreras("Licenciatura en Informática"));
        listaCarreras.add(new Carreras("Licenciatura en Ciencia de Datos"));
        listaCarreras.add(new Carreras("Licenciatura en Bioinformática"));

        // Crear un iterador para recorrer el ArrayList
        Iterator<Carreras> iterador = listaCarreras.iterator();

        // Recorrer las carreras utilizando el iterador
        System.out.println("Lista de materias:");
        while (iterador.hasNext()) {
            Carreras carrera = iterador.next();
            System.out.println(carrera.getNombre());
        }
    }
}

