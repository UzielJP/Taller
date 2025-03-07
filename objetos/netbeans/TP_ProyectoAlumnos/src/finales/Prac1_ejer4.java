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
public class Prac1_ejer4 {
    public static void main(String[] args){
        
        GeneradorAleatorio.iniciar();
        
        int i,k,j,z;
        int ancho=8;
        int largo=4;
        int [] [] tabla = new int[ancho][largo];
        
        
        for(i=0;i<ancho;i++){
            for(j=0;j<largo;j++){
                tabla[i][j]=0;
            }
        }
        
        int num=GeneradorAleatorio.generarInt(10);
        System.out.println(num);
        int num2=GeneradorAleatorio.generarInt(largo);
        System.out.println(num2);
        while(num < 8){
            tabla[num][num2]++;
            num=GeneradorAleatorio.generarInt(10);
            num2=GeneradorAleatorio.generarInt(largo);
        }
        
        for(i=0;i<ancho;i++){
            for(j=0;j<largo;j++){
                System.out.println("El contenido dentro de: "+i+" y "+j+" es "+tabla[i][j]+". ");
                System.out.println("-----");
            }
        }
        
    }
    
}
