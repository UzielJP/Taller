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
public class Trabajador extends Persona{
    private String tarea;
    
    public Trabajador(String tarea,int DNI,int edad,String nombre){
    super(DNI,edad,nombre);
    this.tarea=tarea;
    }
    
    @Override
    public String toString(){
    return super.toString()+" y soy "+getTarea()+".";
    }
    
    public String getTarea(){
    return this.tarea;
    }
    
    public void setTarea(String tarea){
    this.tarea=tarea;
    }
    
}
