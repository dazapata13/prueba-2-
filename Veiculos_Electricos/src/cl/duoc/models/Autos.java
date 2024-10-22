/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Autos extends Veiculos{
    private String cantidadPasajeros;
    private boolean modoAUtopilot;

    public Autos() {
    }

    public Autos(String cantidadPasajeros, boolean modoAUtopilot) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.modoAUtopilot = modoAUtopilot;
    }
    

    public String getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(String cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isModoAUtopilot() {
        return modoAUtopilot;
    }

    public void setModoAUtopilot(boolean modoAUtopilot) {
        this.modoAUtopilot = modoAUtopilot;
    }

    @Override
    public String toString() {
        return "Autos{" + "cantidadPasajeros=" + cantidadPasajeros + ", modoAUtopilot=" + modoAUtopilot + '}';
    }
    
}
