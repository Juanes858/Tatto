/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Juanes
 */
public class Local {
    private String Direccion;
    private int Servicios;
    ArrayList<Implementos> implementos;
    Tatuador tatuador;

    public Local() {
    }

    public Local(String Direccion, int Servicios) {
        this.Direccion = Direccion;
        this.Servicios = Servicios;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Servicios
     */
    public int getServicios() {
        return Servicios;
    }

    /**
     * @param Servicios the Servicios to set
     */
    public void setServicios(int Servicios) {
        this.Servicios = Servicios;
    }
    
    
}
