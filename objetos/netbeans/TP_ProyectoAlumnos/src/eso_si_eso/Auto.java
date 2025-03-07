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
public class Auto {
    
    private int patente;
    private String nombreD;
    
    public Auto(){}
    
    public Auto(int unPatente, String unNombreD){
    
        this.nombreD=unNombreD;
        this.patente=unPatente;
        
    }

    public int getPatente() {
        return this.patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }
    
    public String toString(){
    
        return "Auto con la patente: "+getPatente()+". Cuyo dueño es: "+getNombreD();
        
    }
}

/*
   public String toString(){
       
       String aux="";
       int i,j;
       
       for(i=0;i<getCantPisos();){
       
           for(j=0; j<getCantPlaza();){
           
               if(getEstadoPlaza(i,j)=="Libre"){
               
                   aux=aux+paraString(i,j);
               
               }
               
           j++;
           }
       
       i++;
       }
       
       return aux;
   }

*/