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
public class Circulo extends Figura {
    private double radio;

    public Circulo(double unRadio, String unCR, String unCL) {
        super(unCR, unCL);
        this.radio = unRadio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double unRadio) {
        this.radio = unRadio;
    }
    
    public double calcularPerimetro(){
        double PI=Math.PI;
        return 2*PI*radio;
    }
    
    public double calcularArea(){
        double PI=Math.PI;
        return PI*(radio*radio);
    }
    
    public String toString(){
        String aux="El radio del circulo es "+radio+". ";
        return aux+super.toString();
    }
    
}
