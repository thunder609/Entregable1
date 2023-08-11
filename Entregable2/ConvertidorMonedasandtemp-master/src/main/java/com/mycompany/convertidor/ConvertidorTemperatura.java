/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertidor;

/**
 *
 * @author oswaldo20
 */
public class ConvertidorTemperatura {
    double temp;
    int temp1,temp2;
    double result;

    public ConvertidorTemperatura() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

 

  

  

    public int getTemp1() {
        return temp1;
    }

    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }

    public int getTemp2() {
        return temp2;
    }

    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public Double  convertidorTemperaturea(){
      
        if (temp1==0  && temp2==0){
           result=temp; 
        
        }
           else if (temp1==0  && temp2==1)
           {
           result=((temp-32)* 5/9) ;   
            //   result=temp; 
           }
           if (temp1==1  && temp2==1){
           result=temp; 
        
        }
           else if (temp1==1  && temp2==0)
           {
           result=((temp*1.800)+ 32) ;   
            //   result=temp; 
           }
       return result;
    }   
 
}

