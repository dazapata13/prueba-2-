/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Bicicletas_electricas extends Veiculos {
    private String tipoFrenos;
    private int capacidadBateria;

    public Bicicletas_electricas() {
    }

    public Bicicletas_electricas(String tipoFrenos, int capacidadBateria) {
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateria = capacidadBateria;
    }
    

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "Bicicletas_electricas{" + "tipoFrenos=" + tipoFrenos + ", capacidadBateria=" + capacidadBateria + '}';
    }
    
}
