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
public class Triangulo extends Figura{
    private int lado1;
    private int lado2;
    private int lado3;
    
    public Triangulo(int unLado1, int unLado2, int unLado3, String unColorRe, String unColorLi){
        super(unColorRe,unColorLi);
        lado1=unLado1;
        lado2=unLado2;
        lado3=unLado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }


    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    public double calcularPerimetro(){
    return lado1+lado2+lado3;
    }
    
    public double calcularArea(){
    double s,a,b,c;
    a=lado1;
    b=lado2;
    c=lado3;
    s=(a+b+c)/2;
    s=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return s;
    }
    
    public String toString(){
        String aux="Lado 1: "+lado1+". Lado 2: "+lado2+". Lado 3: "+lado3;
        aux= aux+super.toString();
        return aux;
    }
}
