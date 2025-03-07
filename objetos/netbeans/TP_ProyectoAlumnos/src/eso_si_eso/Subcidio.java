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
public class Subcidio {
    
    private boolean estado;
    private double dineroMonto;
    private String motivo;

    public Subcidio(double unDineroMonto, String unMotivo){
        this.dineroMonto=unDineroMonto;
        this.motivo=unMotivo;
        this.estado=false;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstadoTrue() {
        this.estado = true;
    }
    
    public void setEstadoFalse() {
        this.estado = false;
    }

    public double getDineroMonto() {
        return dineroMonto;
    }

    public void setDineroMonto(double dineroMonto) {
        this.dineroMonto = dineroMonto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
    
}
