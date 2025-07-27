/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sensores;

/**
 *
 * @author USER
 */
public class SensorReversa {

    private boolean frenoDeManoActivado;
    private boolean enReversa;
    private boolean obstaculoDetectado;

    private boolean alarmaActiva;
    private String mensajeAlarma;

    public SensorReversa() {
        this.frenoDeManoActivado = false;
        this.enReversa = false;
        this.obstaculoDetectado = false;
        this.alarmaActiva = false;
        this.mensajeAlarma = "Condiciones normales.";
    }

    public void activarFrenoDeMano() {
        frenoDeManoActivado = true;
        System.out.println("Freno de mano activado.");
        verificarAlarma();
    }

    public void liberarFrenoDeMano() {
        frenoDeManoActivado = false;
        System.out.println("Freno de mano liberado.");
        verificarAlarma();
    }

    public void iniciarReversa() {
        enReversa = true;
        System.out.println("Vehículo en reversa.");
        verificarAlarma();
    }

    public void detenerReversa() {
        enReversa = false;
        System.out.println("Vehículo detenido.");
        verificarAlarma();
    }

    public void detectarObstaculo(boolean estado) {
        obstaculoDetectado = estado;
        System.out.println(estado ? "Obstáculo detectado detrás del vehículo." : "Sin obstáculos en reversa.");
        verificarAlarma();
    }

    private void verificarAlarma() {
        if (enReversa && frenoDeManoActivado) {
            emitirAlarma("¡Alerta! Reversa activada con el freno de mano puesto.");
        } else if (enReversa && obstaculoDetectado) {
            emitirAlarma("¡Alerta! Obstáculo detectado al retroceder.");
        } else {
            apagarAlarma();
        }
    }

    private void emitirAlarma(String mensaje) {
        alarmaActiva = true;
        mensajeAlarma = mensaje;
    }

    private void apagarAlarma() {
        alarmaActiva = false;
        mensajeAlarma = "Condiciones normales.";
    }

    public boolean isAlarmaActiva() {
        return alarmaActiva;
    }

    public String getMensajeAlarma() {
        return mensajeAlarma;
    }

    public boolean isFrenoDeManoActivado() {
        return frenoDeManoActivado;
    }

    public boolean isEnReversa() {
        return enReversa;
    }  
}
