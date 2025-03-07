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
public class Mes extends Estacion{
    
    
    public Mes(int yearInicio, int yearFin, String nombre, double latitud, double longitud){
        super(yearInicio,yearFin,nombre,latitud,longitud);    
    }
    
    
    public double TempProm(int year, int mes){
        
        double promedio=0;
        
        for (year=0;year<getTotalYears();){
            
            promedio=promedio+getTemperatura(year,mes);
            year++;
        }
        
        return promedio/getTotalYears();
        
    }
    

    
        public String toString(){
        
        String aux=super.toString();
        int i,j;
        i=0;
            for(j=0;j<12;){
               
                aux=aux+"-Mes: "+(j+1)+": "+TempProm(i,j)+"           "
                        + "";
                j++;
                i++;
            }
         
        return aux;
    }
    
    
}
