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
public class Entrenador extends Empleados {
    
    private int campGanado;
    
       public Entrenador(int campGanado,String nombre, double sueldo, int antiguedad){
            super(nombre,sueldo,antiguedad);
            this.campGanado=campGanado;
       }
       
    public double calcularEfectividad(){    
        return this.getCampGanado()/super.getAntiguedad();
    }  
    
    public double calcularSueldoACobrar(){
        double aux=super.calcularSueldoACobrar();
            if(this.getCampGanado()>10){
            aux=aux+50000;
            }else{ 
                if(this.getCampGanado()>5){
                    aux=aux+30000;
                }else{
                    if(this.getCampGanado()>1){
                        aux=aux+5000;
                    }
                }
            }
        return aux;
    }
    
       
    public int getCampGanado() {
        return campGanado;
    }

    public void setCampGanado(int campGanado) {
        this.campGanado = campGanado;
    }
       
    
    
    
}
