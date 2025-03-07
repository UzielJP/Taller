/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class ejer_4_2 {
    public static void main(String[] args){
        Jugador unJugador;
        Entrenador unEntrenador;
        String unNombre;
        double unSueldo;
        int unAntiguedad;
        int unGol;
        int unPartido;
        int unCampeonato;
        System.out.println("Insertar Nombre Del Jugador");
        unNombre=Lector.leerString();
        System.out.println("Insertar Partidos Jugados");
        unPartido=Lector.leerInt();
        System.out.println("Insertar Goles Metidos");
        unGol=Lector.leerInt();
        System.out.println("Insertar Sueldo De Los Empleados");
        unSueldo=Lector.leerDouble();
        System.out.println("Insertar Antiguedad Del Jugador");
        unAntiguedad=Lector.leerInt();
        unJugador= new Jugador(unPartido,unGol,unNombre,unSueldo,unAntiguedad);
        System.out.println("Insertar Nombre Del Entrenador");
        unNombre=Lector.leerString();
        System.out.println("Insertar Antiguedad Del Entrenador");
        unAntiguedad=Lector.leerInt();
        System.out.println("Insertar Campeonatos Ganados");
        unCampeonato=Lector.leerInt();
        unEntrenador= new Entrenador(unCampeonato,unNombre,unSueldo,unAntiguedad);
        System.out.println(unJugador.toString());
        System.out.println(unEntrenador.toString());
    }
}
