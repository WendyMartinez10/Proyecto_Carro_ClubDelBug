/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puertas;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author USER
 */

public class Puertas {
    
    private final Map<String, Boolean> puertas = new HashMap<>();

    public Puertas() {
        puertas.put("Delantera Izquierda", false);
        puertas.put("Delantera Derecha", false);
        puertas.put("Trasera Izquierda", false);
        puertas.put("Trasera Derecha", false);
    }

    public void abrirPuerta(String nombre) {
        if (puertas.containsKey(nombre)) {
            puertas.put(nombre, true);
        }
    }

    public void cerrarPuerta(String nombre) {
        if (puertas.containsKey(nombre)) {
            puertas.put(nombre, false);
        }
    }

    public void mostrarPuertasAbiertas() {
        puertas.forEach((nombre, estado) -> {
            if (estado) System.out.println("- " + nombre);
        });
    }
}
