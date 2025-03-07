/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eso_si_eso;

/**
 *
 * @author Usuario
 */
public class Fecha {
    
    private int diaF;
    private String ciudadF;

    public Fecha(int unDia, String unCiudad){
        this.ciudadF=unCiudad;
        this.diaF=unDia;
    }
    
    public int getDia() {
        return diaF;
    }

    public String getCiudad() {
        return ciudadF;
    }
    
    
}
