/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {

    /**
     * Carga un vector que representa la tabla del 2
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++){
            tabla2[i]=GeneradorAleatorio.generarInt(10)*2;
        }
        System.out.println("2x" + "5" + "="+ tabla2[5]);
        for (i=0; i<DF; i++){
             System.out.println("El resultado dentro de l espacio "+i+" es "+tabla2[i]);
        }
        

    }
    
}
