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
public class Evento extends Recital{
    
    private String[] motivo= new String[3];
    private String nombreC;
    private double diaEv;
    private int unMotivo;
    
    public Evento(String unNombreC, double unDiaEv,int unaMotivo ,String unNombreB, int unListaT){
         super(unNombreB,unListaT);
         this.nombreC=unNombreC;
         this.diaEv=unDiaEv;
         this.unMotivo=unaMotivo;
         this.motivo[0]="a beneficio";
         this.motivo[1]="show de TV";
         this.motivo[2]="show privad";
    }

    public int getUnMotivo(){
        return this.unMotivo;
    }
    
    public String getMotivo(){
        return motivo[getUnMotivo()];
    }
    
    public String getNombreC() {
        return nombreC;
    }

    public double getDiaEv() {
        return diaEv;
    }
    
    public String actuar(){

        String aux;
        
        if(getUnMotivo()==0){
            aux="Y recuerden colaborar con "+getMotivo();
        }else{
            
            if(getUnMotivo()==1){
                
                aux="Saludos amigos televidentes";
            
            }else{
            
                aux="Un feliz cumpleaños para "+getNombreC();
                
            }
        
        }
            
        aux=aux+super.actuar();
        
        return aux;
    }
    
    public double calcularCostos(){
    
        double aux;
        
        if(getUnMotivo()==1){
            aux=0;
        }else{
            
            if(getUnMotivo()==2){
                
                aux=50000;
            
            }else{
            
                aux=150000;
                
            }
        
        }            
        
        return aux;
    }
    
}
