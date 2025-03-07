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
public class ejer_4_1 {
    public static void main(String[] args){
        Circulo unCirculo;
        Triangulo unTriangulo;
        String unColorRe;
        String unColorLi;
        int unLado1,unLado2,unLado3;
        double unRadio;
        System.out.println("Ingresar color de relleno");
        unColorRe=Lector.leerString();
        System.out.println("Ingresar color de linea");
        unColorLi=Lector.leerString();
        System.out.println("Ingresar Los 3 Lado De Su Triangulo");
        unTriangulo= new Triangulo(unLado1=Lector.leerInt(), unLado2=Lector.leerInt(),unLado3=Lector.leerInt(),unColorRe,unColorLi);
        System.out.println("Ingresar El Radio De Su Circulo");
        unCirculo= new Circulo(unRadio=Lector.leerDouble(),unColorRe,unColorLi);
        System.out.println(unTriangulo.toString());
        System.out.println(unCirculo.toString());
    }
}
