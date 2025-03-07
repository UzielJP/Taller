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
public abstract class Estacion {
    
    private String nombre;
    private double latitud;
    private double longitud;
    private double[][] year;
    private int yearInicio;
    private int yearFin;
    
    public Estacion(int yearInicio,int yearFin,String nombre, double latitud, double longitud){
        
         this.nombre=nombre;
         this.latitud=latitud;
         this.longitud=longitud;
         this.yearInicio=yearInicio;
         this.yearFin=yearFin;
         this.year= new double[yearFin-yearInicio][12];
         
         int i;
         int j;
         
            for(i=0;i<yearFin-yearInicio;i++){
                
                for(j=0;j<12;j++){
                    this.year[i][j]=60;
                }
    
                
            }
            
            for(i=0;i<yearFin-yearInicio;i++){
                
                for(j=0;j<12;j++){
                    System.out.println(" Año: "+i+" Mes:"+j+" Temperatura:"+getTemperatura(i,j));
                }
    
                
            }
            
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getYearFin(){
        return this.yearFin;
    }
    
    public int getTotalYears(){
        return getYearFin()-getYearInicio();
    }
    
    public double getLatitud(){
        return this.latitud;
    }
    
    public double getLongitud(){
        return this.longitud;
    }
    
    public int getYearInicio(){
        return this.yearInicio;
    }
    
    public double getTemperatura(int year, int mes){
        return this.year[year][mes];
    }
    
    public void setTemperatura(int year, int mes, double temperatura){
        this.year[year][mes]=temperatura;
    }
    
    public String toString(){
    return getNombre()+" ("+getLatitud()+getLongitud()+"): ";
    }
    
    public String mayorTemp(){
        
        double mayor=-1;
        int i,j;
        int mayorY=1;
        int mayorM=1;
        
        for(i=0;i<getTotalYears();){
        
            for(j=0;j<12;){
                
                if(getTemperatura(i,j)>mayor){
                    
                    mayor=getTemperatura(i,j);
                    mayorY=i;
                    mayorM=j;
                                       
                }
                j++;
            }
            i++;
        }
    
        return "La mayor temperatura se registro en el mes: "+mayorM+" En el año: "+mayorY;
                
    }
    
    public abstract double TempProm(int year,int mes);
    
}
