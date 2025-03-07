/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/*import PaqueteLectura.Lector;*/

public class Ej03Matrices {

    public static void main(String[] args) {
	 

	GeneradorAleatorio.iniciar(); 
        int i,j,k,z;
        int ancho=8;
        int largo=4;
        int x=0;
        int [][] tabla = new int[ancho][largo];
        
        int uno=1;

        
        for (i=0;i<ancho;i++){ 
            for(j=0;j<largo;j++){ 
                 tabla[i][j]=0;
            }
        }
        
       /*k= Lector.lectorInt() ;
            while(k<9){
                 z=GeneradorAleatorio.generarInt(4);
                 
                 if(k>8){
                    tabla[k][z]=tabla[k][z]+uno;
                 }

                 x=x++;
                 if(x==10){
                     k=10;
                 }        

                 k=GeneradorAleatorio.generarInt(8);
            }
        */
       for (i=0;i<ancho;i++){ 
           for(j=0;j<largo;j++){ 
               System.out.print("La cantidad de personas que accedieron al piso "+i+" al departamenteo "+j+" es de: "+tabla[i][j]);
               System.out.println("-------");
           }
       }
       
       
    
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
    
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.

        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".

    }
}
