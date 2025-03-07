
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;


public class Ej02Jugadores {

  
    public static void main(String[] args) {
        
       GeneradorAleatorio.iniciar();
        
       int [][] tabla = new int[5][5];
       
       int [] tabla2 = new int[5];
               
       int i,j,valor;
       int suma=0;
       
       for(i=0;i<5;i++){
           
           for(j=0;j<5;j++){
               tabla[i][j]=GeneradorAleatorio.generarInt(30);
               System.out.print(tabla[i][j]);
               System.out.println("------------");
           }
       
       }
       
        for(i=0;i<5;i++){
           
           for(j=0;j<5;j++){
               System.out.print(tabla[i][j]);
               System.out.print("-");
           }
           System.out.println("------------");
       
       }
       
       for(j=0;j<5;j++){
           
           suma=suma+tabla[1][j];
           
       }
       
       System.out.println("Suma: "+suma);
       
       for(j=0;j<5;j++){tabla2[j]=0;}
       
       for(j=0;j<5;j++){
       
           for (i=0;i<5;i++){
                tabla2[j]=tabla2[j]+tabla[i][j];
            }
       
       }
       
       for(j=0;j<5;j++){
       System.out.println("Posicion Tabla2 contiene: "+tabla2[j]);
       }
       
       System.out.println("Ingresar valor a buscar");
       valor=Lector.leerInt();
       int pos1=0;
       int pos2=0;
       for(i=0;i<5;i++){
           
           for(j=0;j<5;j++){
               int igual=tabla[i][j];
               if(valor==igual){
                   pos1=i;
                   pos2=j;
               }
               
           }
       
       }
       
       System.out.println("El valor se encuentra en la posicion "+pos1+","+pos2);
        
       
    }
    
}
