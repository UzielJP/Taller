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
public class Estacionamiento {
   
   private int direccion;
   private double horaApertura;
   private double horaCierre;
   private String nombre;
   private Auto[][] auto;
   private boolean[][] estadoPlaza;
   private int cantPisos;
   private int cantPlaza;
   
   public Estacionamiento(String unNombre, int unDireccion){
   
       int i,j;
       this.direccion=unDireccion;
       this.nombre=unNombre;
       this.horaApertura=8.00;
       this.horaCierre=21.00; 
       this.cantPisos=5;
       this.cantPlaza=10;
       auto = new Auto[5][10];
       estadoPlaza= new boolean[5][10];
       
       
        for(i=0;i<5;){

            for(j=0;j<10;){
                
                this.seEstadoPlaza(i, j);
                j++;
                
            }
            
            i++;
        }
        
   }
   
   public Estacionamiento(String unNombre, int unDireccion, double unHoraApertura, double unHoraCierre, int unNumPizo, int unNumPlaza){
       
       int i,j;
       this.direccion=unDireccion;
       this.nombre=unNombre;
       this.horaApertura=unHoraApertura;
       this.horaCierre=unHoraCierre;   
       this.cantPisos=unNumPizo;
       this.cantPlaza=unNumPlaza;
       auto = new Auto[unNumPizo][unNumPlaza];
       estadoPlaza= new boolean[unNumPizo][unNumPlaza];
       
        for(i=0;i<unNumPizo;){

             for(j=0;j<unNumPlaza;){

                 this.seEstadoPlaza(i, j);
                 j++;

             }

             i++;
         }
       
       
   }
   
   public Auto getAuto(int i, int j){
       return this.auto[i][j];
   }
   
   public void SetAuto(Auto unAuto, int i, int j){
       this.auto[i][j]=unAuto;
       this.estadoPlaza[i][j]=true;
   }
   
   public String getEstadoPlaza(int i, int j){
       
       String aux;
       
        if(this.estadoPlaza[i][j]==true){
            aux="Libre";
        }else{
            aux="Ocupado";
        }
       
       return aux;
   }

    public int getCantPisos() {
        return cantPisos;
    }

    public int getCantPlaza() {
        return cantPlaza;
    }
   
   
   
   private void seEstadoPlaza(int i, int j){
       this.estadoPlaza[i][j]=false;
   }
   
   public String paraString(int i, int j){
   
       return "Piso numero: "+i+". Plaza numero: "+j+". Estado: "+getEstadoPlaza(i,j)+". "+getAuto(i,j).toString();
   
   }
   
   public String toString(){
       
       String aux="";
       int i,j;
       
       for(i=0;i<getCantPisos();){
       
           for(j=0; j<getCantPlaza();){
               

                   aux=aux+"Piso numero: "+i+". Plaza numero: "+j+". Estado: "+getEstadoPlaza(i,j)+". ";
                   if(this.estadoPlaza[i][j]==true){
                       aux=aux+getAuto(i,j).toString();
                   }
               
           j++;
           }
       
       i++;
       }
       
       return aux;
   }
   
   
   /*public String BuscarAuto(int unPatente){
       
       String aux="Auto Inexistente";
       int i,j,patenteA;
       
       for(i=0;i<getCantPisos();){
       
           for(j=0; j<getCantPlaza();){
               patenteA=getAuto(i,j).getPatente();
               if(patenteA==unPatente){
               
                   aux="El auto se encuentra en el piso: "+i+". En la plaza: "+j;
               
               }
               
           j++;
           }
       
       i++;
       }
       
       return aux;
   }
   */

   
   
   public int autosPlaza(int j){
       
       int i,aux;
       aux=0;
       for(i=0; i<getCantPisos();){
       
           if(getEstadoPlaza(i,j)=="Ocupado"){
           
               aux=aux+1;
               
           }
       
           i++;
       }
       
       return aux;
   }
   
}
