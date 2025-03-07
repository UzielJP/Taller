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
public class Persona {
    private int DNI;
    private int edad;
    private String nombre;
    
    public Persona(int DNI,int edad, String nombre){
        this.DNI=DNI;
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public String toString(){
    return "Mi nombre es "+getNombre()+" Mi DNI es "+getDNI()+" y tengo "+getEdad()+".";
    }
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
