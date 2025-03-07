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
public class Investigador {
    
    private int cantSub;
    private int cantMaxSub=5;
    private String nombreCompleto;
    private String categoria;
    private String especialidad;
    private Subcidio[] subcidioV;
    
    public Investigador(String unNombreCompleto, String unEspecialidad, String unCategoria){
        
        this.nombreCompleto=unNombreCompleto;
        this.categoria=unCategoria;
        this.especialidad=unEspecialidad;
    
    }

    public void OtorgarTodos(){
        int i;
        for(i=0;i<getCantSub();){
            getSubcidio(i).setEstadoTrue();
            i++;
        }
    }
    
    public double getDinero(){
        
        int i;
        double j=0;
        
        for(i=0;i<getCantSub();){
            
            if(getSubcidio(i).isEstado()==true){
            
               j = j+getSubcidio(i).getDineroMonto();
                
            }

            i++;
            
        }
        
        return j;
    }
    
    public void setSubcidioV(int unCantSub){
    
        if(unCantSub<getCantMaxSub()){
            subcidioV= new Subcidio[unCantSub];
        }else{
            subcidioV= new Subcidio[getCantMaxSub()];
        }
        
        this.cantSub=0;
        
    }

    private int getCantMaxSub() {
        return cantMaxSub;
    }

    private int getCantSub() {
        return cantSub;
    }
        
    public Subcidio getSubcidio(int i){
        return this.subcidioV[i];
    }
    
    public void agregarSubcidio(Subcidio unSubcidio){
        
        this.subcidioV[getCantSub()]=unSubcidio;
        this.cantSub++;
        
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String toString(){
    
        return "El investigador: "+getNombreCompleto()+". De la categoria: "+getCategoria()+" Cuya especialidad es: "+getCategoria()+" Recibe un monto total de: "+getDinero();
    
    }
    
}
