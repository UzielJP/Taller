/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eso_si_eso;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class ejer_5_3 {
    
    public static void main(String[] args){
        
        Gira unGira;
        Evento unEvento;
        String unNombreB,unNombreC,unNombreG;
        int unListaT,unaMotivo,unFechas;
        double unDiaEv;
        System.out.println("Ingresar unFechas,unNombreG,unNombreB,unListaT");
        unGira= new Gira(unFechas=Lector.leerInt(),unNombreG=Lector.leerString(),unNombreB=Lector.leerString(),unListaT=Lector.leerInt());
        System.out.println("Ingresar unNombreC,unDiaEv,unaMotivo,unNombreB,unListaT");
        unEvento= new Evento(unNombreC=Lector.leerString(),unDiaEv=Lector.leerDouble(),unaMotivo=Lector.leerInt(),unNombreB,unListaT);
        System.out.println(unEvento.actuar());
        System.out.println(unGira.actuar());
        System.out.println(unEvento.calcularCostos());
        System.out.println(unGira.calcularCostos());
    }
    
    
}
