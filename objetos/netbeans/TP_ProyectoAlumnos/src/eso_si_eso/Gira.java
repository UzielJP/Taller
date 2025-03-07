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
public class Gira extends Recital{
    
    private int dimL;
    private String nombreG;
    private Fecha[] fechas;
    private int dimF;
    
    public Gira(int unFechas, String unNombreG, String unNombreB, int unListaT){
        super(unNombreB,unListaT);
        this.nombreG=unNombreG;
        this.fechas= new Fecha[unFechas];
        this.dimL=0;
        this.dimF=unFechas;
    }

    public String getNombreG() {
        return nombreG;
    }
    
    public Fecha getFecha(int i){
        return this.fechas[i];
    }
    
    public void agregarFecha(Fecha unFecha){
        this.fechas[this.dimL]=unFecha;
        this.dimL++;
    }
    
    public String actuar(){
        
        int i;
        String aux="Buenas noches ";
        
        for(i=0;i<this.dimL;){        
            aux=aux+this.fechas[i].getCiudad();
            aux=aux+super.actuar();
        }
        
        return aux;
    }
    
    public double calcularCostos(){
        return this.dimF*30000;
    }
}
