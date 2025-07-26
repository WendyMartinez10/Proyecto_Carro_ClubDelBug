/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinturones;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author USER
 */


public class Cinturones {

    private final Map<String, Boolean> cinturones = new HashMap<>();

    public Cinturones() {
        cinturones.put("Conductor", false);
        cinturones.put("Pasajero Frontal", false);
        cinturones.put("Pasajero Trasero Izquierdo", false);
        cinturones.put("Pasajero Trasero Derecho", false);
    }

    public void colocarCinturon(String persona) {
        if (cinturones.containsKey(persona)) {
            cinturones.put(persona, true);
        }
    }

    public void quitarCinturon(String persona) {
        if (cinturones.containsKey(persona)) {
            cinturones.put(persona, false);
        }
    }

    public void estadoCinturones() {
        cinturones.forEach((persona, estado) -> {
           System.out.println(persona + ": " + (estado ? "Colocado" : "No colocado"));
        });
    }
}