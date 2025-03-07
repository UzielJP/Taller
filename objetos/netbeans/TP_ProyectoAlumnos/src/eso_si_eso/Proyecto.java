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
public class Proyecto {
    
    private int cantInv;
    private int codigo;
    private Investigador[] investigadorV;
    private int cantInvMax=50;
    private String nombreProyecto;
    private String nombreDirector;
    
    public Proyecto(int unCodigo, String unNombreDirector, String unNombreProyecto){
        this.nombreProyecto=unNombreProyecto;
        this.codigo=unCodigo;
        this.nombreDirector=unNombreDirector;
        
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
    
    
    
    public void setCrearV(int unCantInvt){
        
        if(unCantInvt<getCantInvMax()){
            investigadorV= new Investigador[unCantInvt];
        }else{
            investigadorV= new Investigador[50];
        }
        
        this.cantInv=0;
    }
    
    public double TotalDineroOtorgado(){
        
        int i;
        double j=0;
        
        for(i=0;i<getCantInv();){
           j= j+ getInvestigadorV(i).getDinero();
           i++;
        }
        
        return j;
    }
    
    private int getCantInv(){
        return this.cantInv;
    }

    private int getCantInvMax(){
        return this.cantInvMax;
    }
    
        public Investigador getInvestigadorV(int i) {
        return investigadorV[i];
    }

    public void AgregarInvestigador(Investigador unInvestigador) {
        this.investigadorV[getCantInv()] = unInvestigador;
        this.cantInv++;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
    
    public String toString(){
        String aux=". El nmbre del proyecto es: "+getNombreProyecto()+". Cuyo codigo es: "+getCodigo()+". El proyecto dirigido por: "+getNombreDirector()+". Y el monto total invertido en el es de:$"+TotalDineroOtorgado();
        int i;
        for(i=0;i<getCantInv();){
            aux=aux+" "+getInvestigadorV(i).toString();
            i++;
        }
        return aux;
    }
    
}
