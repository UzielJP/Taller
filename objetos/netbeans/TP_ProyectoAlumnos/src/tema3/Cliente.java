/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Usuario
 */
public class Cliente {
   private int DNI;
   private String nombre;
   private int edad;

   public Cliente(){}
   
   public Cliente(int unDNI, String unNombre, int unEdad){
   DNI=unDNI;
   nombre=unNombre;
   edad=unEdad;
   }
   
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
    return " Cliente: Nombre: "+nombre+" Edad: "+edad+" DNI: "+DNI;
    }
    
}
