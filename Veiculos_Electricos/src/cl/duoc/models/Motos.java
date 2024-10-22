/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Motos extends Veiculos {
    private String capacidadBateria;
    private boolean asistenciaModoEco;

    public Motos() {
    }

    public Motos(String capacidadBateria, boolean asistenciaModoEco) {
        this.capacidadBateria = capacidadBateria;
        this.asistenciaModoEco = asistenciaModoEco;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isAsistenciaModoEco() {
        return asistenciaModoEco;
    }

    public void setAsistenciaModoEco(boolean asistenciaModoEco) {
        this.asistenciaModoEco = asistenciaModoEco;
    }

    @Override
    public String toString() {
        return "Motos{" + "capacidadBateria=" + capacidadBateria + ", asistenciaModoEco=" + asistenciaModoEco + '}';
    }
    
}
