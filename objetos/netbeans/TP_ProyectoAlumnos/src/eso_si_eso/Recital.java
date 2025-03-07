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
public abstract class Recital {
    
    private int dimL;
    private int dimF;
    private String nombreB;
    private String[] tema;
    
    public Recital(String unNombreB,int unListaT){
        this.tema= new String[unListaT];
        this.nombreB=unNombreB;
        this.dimL=0;
        this.dimF=unListaT;
    }
    
    public void agregarTema(String unTema){
        this.tema[this.dimL]=unTema;
        this.dimL++;
    }
    
    
    
    public String actuar(){
        
        int i;
        String aux="y ahora tocaremos ";
        
        for(i=0;i<this.dimL;){        
            aux=aux+this.tema[i]+". ";       
        }
        return aux;
    }
    
    public abstract double calcularCostos();
}
