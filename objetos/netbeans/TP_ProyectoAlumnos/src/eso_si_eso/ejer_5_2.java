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
public class ejer_5_2 {
    
    public static void main(String[] args){
        Estacionamiento unEstacionamiento;
        Auto unAuto;

        System.out.println("Insertar nombre, direccion, hore de apertura, hora de cierre, numero de pizo y numero de plaza");
        
        unEstacionamiento= new Estacionamiento("hola",2345,8.00,23.00,3,3);
   
                                unAuto= new Auto();
                                unAuto.setPatente(245);
                                unAuto.setNombreD("jaime");
                unEstacionamiento.SetAuto(unAuto, 1, 2);
       
                unEstacionamiento.SetAuto(unAuto, 2, 1);

                unEstacionamiento.SetAuto(unAuto, 0, 1);
 
                unEstacionamiento.SetAuto(unAuto, 0, 0);
     
                unEstacionamiento.SetAuto(unAuto, 0, 2);
  
                unEstacionamiento.SetAuto(unAuto, 1, 1);

        System.out.println(unEstacionamiento.autosPlaza(3));        
        //System.out.println(unEstacionamiento.BuscarAuto(25));
        System.out.println(unEstacionamiento.toString());

    
    }

    
}
