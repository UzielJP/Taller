/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author Usuario
 */
public class ejer_2_4 {
    
    public static void main(String[] args){
            
       int i,diml,maxDiml; 
       int df=20; 
       Partido [] campeonato = new Partido[df];
       String equipoVis;
       equipoVis= new String();
       
       maxDiml=0;
       diml=0;
       i=0;
       System.out.println("Insertar Equipo Visitante:");
       equipoVis=GeneradorAleatorio.generarString(3);
       
       while((equipoVis!="zzz")&&(i<df)){
           
           diml++;
           String equipoLoc;
           equipoLoc= new String();
           int golesLoc,golesVis;
           
                campeonato[i]= new Partido();
                campeonato[i].setVisitante(equipoVis);
                System.out.println("Insertar Equipo Local:");
                campeonato[i].setLocal(equipoLoc=GeneradorAleatorio.generarString(3));
                System.out.println("Insertar Goles Visitante:");
                campeonato[i].setGolesVisitante(golesVis=GeneradorAleatorio.generarInt(5));
                System.out.println("Insertar Goles Local:");
                campeonato[i].setGolesLocal(golesLoc=GeneradorAleatorio.generarInt(5));
           
           
           i++;
           System.out.println("Insertar Equipo Visitante:");
           equipoVis=GeneradorAleatorio.generarString(3);
       }
       
       i=0;
       String river="river";
       String boca="boca";
       int riverGano=0;
       int bocaGano=0;
       while((maxDiml<diml)&&(i<df)){
           
           
           System.out.println(campeonato[i].toString());
           if (campeonato[i].getGanador().equals(river)){
               riverGano++;
           }else {
               if (campeonato[i].getGanador().equals(boca)){
                bocaGano++;
           }
           }
           maxDiml++;
           i++;
           
       }
       System.out.println("River gano un total de "+riverGano+" partidos.");
       System.out.println("Boca gano un total de "+bocaGano+" partidos.");
     }
    
    
}
