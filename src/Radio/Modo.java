/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Radio;

/**
 *
 * @author gipsy
 */
public enum Modo {
    AM(530),
    FM(88),
    BLUETOOTH(-1);
    private final int Frecuencia;

    private Modo(int Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public int getFrecuencia() {
        return Frecuencia;
    }
    
    
}
