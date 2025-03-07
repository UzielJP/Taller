/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class ejer_4_6 {
    
    public static void main(String[] args){
        Year year;
        Mes mes;
        String nombre;
        int yearInicio,yearFin,i,j;
        double latitud,longitud;
        
        System.out.println("ingresar: Año de inicio, año de final, Nombre de la estacion, Latitud y Longitud");
        year= new Year(yearInicio=Lector.leerInt(),
                       yearFin=Lector.leerInt(),nombre=Lector.leerString(),
                       latitud=Lector.leerDouble(),longitud=Lector.leerDouble());
        
        System.out.println("ingresar: Año de inicio, año de final, Nombre de la estacion, Latitud y Longitud");
        mes= new Mes(yearInicio=Lector.leerInt(),
                     yearFin=Lector.leerInt(),nombre=Lector.leerString(),
                     latitud=Lector.leerDouble(),longitud=Lector.leerDouble());
        
        System.out.println("Insertar temperatura del año y mes que quiere conseguir");
        System.out.println(mes.getTemperatura(i=Lector.leerInt() ,j=Lector.leerInt()));
        System.out.println("Insertar temperatura del año y mes que quiere conseguir");
        System.out.println(year.getTemperatura(i=Lector.leerInt() ,j=Lector.leerInt()));
        System.out.println("Insertar temperatura promedio del mes que quiere conseguir junto a un año");
        System.out.println(mes.TempProm(i=Lector.leerInt() ,j=Lector.leerInt()));
        System.out.println("Insertar temperatura primedio del año que quiere conseguir junto a un mes");
        System.out.println(year.TempProm(i=Lector.leerInt() ,j=Lector.leerInt()));
        System.out.println(mes.toString());
        System.out.println(year.toString());
        System.out.println(mes.mayorTemp());
        System.out.println(year.mayorTemp());
        
    }
    
    
}
