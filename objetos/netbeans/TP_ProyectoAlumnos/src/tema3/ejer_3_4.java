/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Usuario
 */
public class ejer_3_4 {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar(); 
        Hotel unHotel;
        Cliente unCliente;
        int n,i;
        System.out.println("Ingresar cantidad de pisos del hotel");
        n=Lector.leerInt();
        unHotel= new Hotel(n);
        unHotel.setHabitaciones();
        for(i=0;i<2;i++){
            int j;
            System.out.println("Ingresar DNI Del Cliente ");
            int unDNI=Lector.leerInt();
            System.out.println("Ingresar Nombre Del Cliente ");
            String unNombre=Lector.leerString();
            System.out.println("Ingresar Edad Del Cliente ");
            int unEdad=Lector.leerInt();
            unCliente= new Cliente(unDNI,unNombre,unEdad);
            System.out.println("Ingresar La Habitacion Del CLiente ");
            j=Lector.leerInt();
            unHotel.getUnaHabitacion(j).setUnCliente(unCliente);
            unHotel.getUnaHabitacion(j).setEstado();
        }
        unHotel.aumentarP(2.78);
        System.out.println(unHotel.toString(3));
    }
}
