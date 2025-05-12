/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_test;

/**
 *
 * @author isajisa
 */
public class Calculadora {
    public static void main(String[] args) {
        
    }
    private int suma=0;
    
    public int suma(int a, int b){
        suma = a + b;
        return suma;
    }

    public double multipicacion(double a, double b){
        return a*b;
    }
    public int factorial(int a){
        if (a<0){
            throw new  IllegalArgumentException("El número tiene que ser un entero positivo");
        }
        if(a==1){
            return 1;
        }
       
        return a*factorial(a-1);
    }
           
        
    

    
    private int restar=0;
    public int restar(int a, int b) {
        restar = a - b;
        return restar;
    }

}
