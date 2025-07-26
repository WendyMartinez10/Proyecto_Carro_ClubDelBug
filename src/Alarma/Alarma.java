/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alarma;

/**
 *
 * @author USER
 */

public class Alarma {
    
    private boolean Alarma;
    private boolean bloqueoPuertas;

    public Alarma() {
        this.Alarma = true;
        this.bloqueoPuertas = true;
    }

    public void activarAlarma() {
        Alarma = true;
    }

    public void desactivarAlarma() {
        Alarma = false;
    }

    public void bloquearPuertas() {
        bloqueoPuertas = true;
    }

    public void desbloquearPuertas() {
        bloqueoPuertas = false;
    }

    public boolean isAlarmaActiva() {
        return Alarma;
    }

    public boolean isPuertasBloqueadas() {
        return bloqueoPuertas;
    }
}