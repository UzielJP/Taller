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
public class Jugador extends Empleados{
    private int partidoJugado;
    private int golAnotado;

    public Jugador(int partidoJugado, int golAnotado, String nombre, double sueldo, int antiguedad){
        super(nombre,sueldo,antiguedad);
        this.partidoJugado=partidoJugado;
        this.golAnotado=golAnotado;
    }
    
    public double calcularEfectividad(){
    return this.getGolAnotado()/this.getPartidoJugado();
    }  
    
    public double calcularSueldoACobrar(){
        double aux=super.calcularSueldoACobrar();
        if(this.calcularEfectividad()>0.5){
        aux=aux+super.getSueldo();
        }
        return aux;
    }
    
    public int getPartidoJugado() {
        return partidoJugado;
    }

    public void setPartidoJugado(int partidoJugado) {
        this.partidoJugado = partidoJugado;
    }

    public int getGolAnotado() {
        return golAnotado;
    }

    public void setGolAnotado(int golAnotado) {
        this.golAnotado = golAnotado;
    }
    
    
    
}
