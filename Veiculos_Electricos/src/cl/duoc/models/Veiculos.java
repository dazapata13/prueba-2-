/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Veiculos implements Interfas{
    private final String codigo = null;
    private boolean servicioMantencion ;
    private int horas ;

    public boolean isServicioMantencion() {
        return servicioMantencion;
    }

    public void setServicioMantencion(boolean servicioMantencion) {
        this.servicioMantencion = servicioMantencion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Veiculos{" + "codigo=" + codigo + ", servicioMantencion=" + servicioMantencion + ", horas=" + horas + '}';
    }
    
    
}
