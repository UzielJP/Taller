/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finales;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author Usuario
 */
public class Pract1_ejer5 {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar(); 
        double k=0;
        int i,j;
        int alto=5;
        int largo=4;
        int [][]tabla= new int [alto][largo];
        for(i=0;i<alto;i++){
            for(j=0;j<largo;j++){
                tabla[i][j]=GeneradorAleatorio.generarInt(10);
                System.out.println(tabla[i][j]);
                System.out.println("----");
            }
        }
        for(j=0;j<largo;j++){
            for(i=0;i<alto;i++){
                k=k+tabla[i][j];
                System.out.println(k);
                System.out.println("----");
            }
            System.out.println("El porcentaje del aspecto "+j+" es de: "+k/5+". ");
            System.out.println("-----");
            k=0;
        }
    }
}
