/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.Lector;

/**
 *
 * @author Usuario
 */
public class NewClass{
    
    public static void main(String[] args) {
    int ocho= Lector.leerInt();
    System.out.println("4 + 4 = " + ocho);
    String todou= new String(Lector.leerString());
    System.out.print(todou);
    }

}
