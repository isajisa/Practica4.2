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
    
    public int dividir (int a, int b){
        if(b==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        suma = a / b;
        return suma;
    }
}
