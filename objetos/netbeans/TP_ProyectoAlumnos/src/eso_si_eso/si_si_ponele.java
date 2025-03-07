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
public class si_si_ponele {
    
    public static void main(String[] args) {
        
        double unEdad= 2.34;
        String unNombre = new String();
        int unTres;
        
        dos d2;
            d2 = new dos();
                System.out.println("Insertar un Nombre");
                d2.setNombre(unNombre = Lector.leerString());
                System.out.println("Insertar un Edad");
                d2.setEdad(unEdad);
                System.out.println("Insertar");
                d2.setTres();
                unTres = d2.getTres();
        
        System.out.println(d2.getNombre());
        System.out.println(d2.getEdad());
        System.out.println(d2.getTres());
        System.out.println(d2.tostring(unNombre,unEdad,unTres));
    }
    
        /* int ocho= Lector.leerInt();
        System.out.println("4 + 4 = " + ocho);
        String todou= new String(Lector.leerString());
        System.out.print(todou); */

}
