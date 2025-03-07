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
public class ejer_4_3 {
    
    public static void main(String[] args){
        Persona unPersona;
        Trabajador unTrabajador;
        int unDNI;
        int unEdad;
        String unNombre;
        String unTarea;
        
        System.out.println("Ingresar DNI, Edad y Nombre");
        
        unPersona= new Persona(unDNI=Lector.leerInt(),unEdad=Lector.leerInt(),unNombre=Lector.leerString());
        
        System.out.println("Ingresar Trabajo,DNI, Edad y Nombre");
        
        unTrabajador= new Trabajador(unTarea=Lector.leerString(),unDNI=Lector.leerInt(),unEdad=Lector.leerInt(), unNombre=Lector.leerString());
                                     
                                    
        System.out.println(unPersona.toString());
        System.out.println(unTrabajador.toString());
        
        
        
    }
    
}
