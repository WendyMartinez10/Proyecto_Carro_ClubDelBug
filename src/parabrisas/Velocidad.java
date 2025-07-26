/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package parabrisas;

/**
 *
 * @author USER
 */
public enum Velocidad {
APAGADO("Apagado"),
    LENTO("Lento"),
    MEDIO("Medio"),
    RAPIDO("Rápido");

    private final String nivel;

     Velocidad(String descripcion) {
        this.nivel = descripcion;
    }

    public String getDescripcion() {
        return nivel;
    }
    
}
