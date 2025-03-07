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
public class Hotel {
    private Habitacion []hotel;
    private int dimL=0;
    
    public Hotel(){
    }
    
    public Hotel(int n){
        hotel= new Habitacion[n];
        dimL=n;
    }

    
    public Habitacion getUnaHabitacion(int i){
        return hotel[i];
    }
    
    
    public void aumentarP(double unPrecio){
    int i;
    for(i=0;i<dimL;i++){
        double j;
        j = hotel[i].getCosteNoche()+unPrecio;
        hotel[i].setCosteNoche(j);
    }
    }
    
    public void setHabitaciones(){
    int i;
    for(i=0;i<dimL;i++){
        hotel[i]= new Habitacion();
    }
    }
    
    public String toString(int i){
    String aux;
    aux = hotel[i].toString();
    aux= aux+hotel[i].getUnCliente().toString();
    return aux;
    }

}
