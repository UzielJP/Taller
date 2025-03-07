/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Usuario
 */
public class VisorFigurasModificado {
    private int guardadas;
    private int capacidadMaxima=5;
    private Figura [] vector;

    public VisorFigurasModificado(){
        guardadas=0;
    }

    public void guardar(Figura f){
        if(this.quedaEspacio()==false){
            guardadas++;
        }
    }
    
    public boolean quedaEspacio(){
        return this.getGuardadas()>this.getCapacidadM();
    }
     
    public int getCapacidadM(){
        return capacidadMaxima;
    }
     
    public void mostrar(){
        int j;
        for(j=0;j<this.getGuardadas();j++){
        System.out.println(vector[j].toString());
        }
    }
    public int getGuardadas() {
        return guardadas;
    }
    
    public void setVector(int i,Figura f){
    vector[i]=f; 
    }
    
    public void setVisorModFig(){
        vector= new Figura[guardadas];
    }

}
