/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Usuario
 */
public class Habitacion {
   private Cliente cliente;
   private double costeNoche;
   private String estado;
   
   public Habitacion(){
       costeNoche=GeneradorAleatorio.generarDouble(6000)+2000;
       estado="Deshocupado";
   }
   
   public Habitacion(Cliente unCliente){
       cliente=unCliente;
       estado="Ocupado";  
   }
   
    public Cliente getUnCliente() {
        return cliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.cliente = unCliente;
    }

    public double getCosteNoche() {
        return costeNoche;
    }

    public void setCosteNoche(double unCosteNoche) {
        this.costeNoche = unCosteNoche;
    }
    
    public String getEstado(){
         return estado;
    }
    
    public void setEstado(){
    estado="Ocupada";
    }
    
    public String toString(){
    return "EL coste de la habitacion es: $"+costeNoche+" esta: "+estado;
    }
    
}
/*=GeneradorAleatorio.generarDouble(6000)+2000*/