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
public class Year extends Estacion{
    
    public Year(int yearInicio, int yearFin, String nombre, double latitud, double longitud){
        super(yearInicio,yearFin,nombre,latitud,longitud);        
    }
    
    public double TempProm(int year, int mes){
        
        double promedio=0;
        
        for (mes=0;mes<12;){            
            promedio=promedio+getTemperatura(year,mes);
            mes++;
        }
        
        return promedio/12;
        
    }
    
    public String toString(){
        
        String aux=super.toString();
        int i,j;
        j=0;
        
        for(i=0;i<getTotalYears();){
            
            aux=aux+"-Año: "+(getYearInicio()+i)+" "+TempProm(i,j)+"           "
                    + "";
            i++;
            j++;
            
        }
        
        
          
        return aux;
    }
    
}
