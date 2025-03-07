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
public abstract class Empleados {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    
    public Empleados(String unNombre, double unSueldo, int unAntiguedad){
        this.nombre=unNombre;
        this.sueldo=unSueldo;
        this.antiguedad=unAntiguedad;
    }

    public String toString(){
    String aux= "Nombre: "+nombre+
                ". Sueldo: "+calcularSueldoACobrar()+
                ". Antiguedad: "+antiguedad+
                ". Efectividad: "+calcularEfectividad();
    return aux;
    }
    
    public double calcularSueldoACobrar(){
        return getSueldo()+(getAntiguedad()*100)/10;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    public abstract double calcularEfectividad();

}
