/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package combustible;

/**
 *
 * @author gipsy
 */
public enum EstadoDelTanque {
    VACIO(0, "Tanque vacio"),
    BAJO(15, "Nivel bajo"),
    MEDIO(50, "Nivel Medio"),
    LLENO(100, "Tanque LLeno");
    
    private final int porcentajeMinimo;
    private final String DescripcionTanque;

    private EstadoDelTanque(int porcentajeMinimo, String DescripcionTanque) {
        this.porcentajeMinimo = porcentajeMinimo;
        this.DescripcionTanque = DescripcionTanque;
    }

    public String getDescripcionTanque() {
        return DescripcionTanque;
    }
    public static EstadoDelTanque desdeNivel(double porcentaje) {
        if (porcentaje <= 0)  return VACIO;
        if (porcentaje <= BAJO.porcentajeMinimo)  return BAJO;
        if (porcentaje <= MEDIO.porcentajeMinimo) return MEDIO;
        return LLENO;
    }
    
   
    }
    

