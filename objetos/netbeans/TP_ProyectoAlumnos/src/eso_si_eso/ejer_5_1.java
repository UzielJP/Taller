/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eso_si_eso;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class ejer_5_1 {
    public static void main(String[] args){
        
        Proyecto unProyecto;
        Investigador unInvestigador;
        Subcidio unSubcidio;
        int unCodigo,unCantSub,unCantInvt,i,j;
        double unDineroMonto;
        String unNombreDirector,unNombreProyecto,unNombreCompleto,unEspecialidad,unCategoria,unMotivo;
           
        System.out.println("Insertar Codigo, nombre del proyecto y nombre del director: ");
        
        unProyecto= new Proyecto(unCodigo=Lector.leerInt(),unNombreDirector=Lector.leerString(),unNombreProyecto=Lector.leerString());
        unProyecto.setCrearV(3);
        
        for(i=0;i<3;){
            
            System.out.println("Insertar Nombre completo, Especialidad y Categoria: ");
            unInvestigador= new Investigador(unNombreCompleto=Lector.leerString(),unEspecialidad=Lector.leerString(),unCategoria=Lector.leerString());
            unProyecto.AgregarInvestigador(unInvestigador);
            unInvestigador.setSubcidioV(2);
            
            for(j=0;j<2;){
                System.out.println("Insertar Monto del subcidio, motivo: ");
                unSubcidio=new Subcidio(unDineroMonto=Lector.leerDouble(),unMotivo=Lector.leerString());
                unInvestigador.agregarSubcidio(unSubcidio);
                j++;
                
            }
            unProyecto.getInvestigadorV(i).getSubcidio(1).setEstadoTrue();
            i++;
        }
        
        System.out.println(unProyecto.toString());
        
    }
}
