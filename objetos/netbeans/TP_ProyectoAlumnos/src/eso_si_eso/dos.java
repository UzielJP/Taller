/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eso_si_eso;

/**
 *
 * @author Usuario
 */
public class dos {
    private int tres;
    private String nombre;
    private double edad;
    
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    
    public void setEdad(double unEdad){
    edad=unEdad;
    }
    
    public void setTres(){
        tres=3;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getEdad(){
        return edad;
    }
    
    public int getTres(){
        return 3;
    }
    
    public String tostring(String unNombre,double unEdad,int unTres){
        String aux;
            aux = "hola "+unNombre+" Tu edad es "+unEdad+" Tu Nombero Favorito Es El "+unTres;
         return aux;
    }
    
}
