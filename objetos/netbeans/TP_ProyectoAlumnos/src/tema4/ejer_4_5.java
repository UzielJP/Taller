/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Usuario
 */
public class ejer_4_5 {
    public static void main(String[] args){
       VisorFigurasModificado visor = new VisorFigurasModificado();

        Cuadrado c1 = new Cuadrado(10,"Violeta","Rosa");
        Rectangulo r= new Rectangulo(20,10,"Azul","Celeste");
        Cuadrado c2= new Cuadrado(30,"Rojo","Naranja");
        
        visor.guardar(c1);
        visor.guardar(r);
        visor.guardar(c2);
        
        visor.setVisorModFig();
        visor.setVector(0, c1);
        visor.setVector(1, r);
        visor.setVector(2, c2);
        visor.mostrar();
    }
}
