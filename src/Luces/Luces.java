/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Luces;

/**
 *
 * @author USER
 */

public class Luces {


    private TipoLuz Delanteras;
    private boolean Intermitentes;
    private boolean Emergencia;
    private boolean Puertas;
    private boolean lucesPuertas;

    public Luces() {
        this.Delanteras = TipoLuz.APAGADAS;
        this.Intermitentes = false;
        this.Emergencia = false;
        this.Puertas = false;
    }

    public void LucesDelanteras(TipoLuz tipo) {
        this.Delanteras = tipo;
    }

    public void lucesIntermitentes(boolean estado) {
        Intermitentes = estado;
    }

    public void lucesEmergencia(boolean estado) {
        Emergencia = estado;
    }

    public void LucesPuertas(boolean estado) {
        lucesPuertas = estado;
    }
    public String getEstadoLuces(){
        return "Luces Delanteras " + Delanteras.getEstado() +"lucesIntermitentes" + (Intermitentes ? "Activadas" : "Desactivadas")+ "lucesEmergencia"+ (Emergencia ? "Activadas" : "Desactivadas") +  "LucesPuertas " +(lucesPuertas ? "Activadas" : "Apagadas");
    }

    public TipoLuz getDelanteras() {
        return Delanteras;
    }

    public boolean isIntermitentes() {
        return Intermitentes;
    }

    public boolean isEmergencia() {
        return Emergencia;
    }
}