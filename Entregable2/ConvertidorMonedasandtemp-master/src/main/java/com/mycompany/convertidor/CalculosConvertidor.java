/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertidor;

/**
 *
 * @author oswaldo20
 */
public class CalculosConvertidor {
    private double  canti;
    private int diINIcial,  diFin;
    private double resul; 

    public CalculosConvertidor() {
    
    }

    public void setCanti(double canti) {
        this.canti = canti;
    }

    public void setDiINIcial(int diINIcial) {
        this.diINIcial = diINIcial;
    }

    public void setDiFin(int diFin) {
        this.diFin = diFin;
    }

    public void setResul(double resul) {
        this.resul = resul;
    }

    public double getCanti() {
        return canti;
    }

    public int getDiINIcial() {
        return diINIcial;
    }

    public int getDiFin() {
        return diFin;
    }

    public double getResul() {
        return resul;
    }

  //Metodo
    public Double convertidor(){
        //Dolar, Euros, Pesos, Bolivares
        double dp=4965.31, de=0.95 , dB=18000 ,ed=1.05,ep=5223.81,eB=19000;
           if (diINIcial==0  && diFin==0){
            resul=canti;  }
           else if (diINIcial==0  && diFin==1){
            resul=de*canti;            
        }else  if (diINIcial==0  && diFin==2){
            resul=dp*canti;            
        }
        else if (diINIcial==0  && diFin==3){
            resul=dB*canti; 
        }else  if (diINIcial==1  && diFin==0){
            resul=ed*canti;  }
           else if (diINIcial==1  && diFin==1){
            resul=canti;            
        }else  if (diINIcial==1  && diFin==2){
            resul=ep*canti;            
        }
        else if (diINIcial==1  && diFin==3){
            resul=eB*canti; 
        }
        
         return resul;

    }
}