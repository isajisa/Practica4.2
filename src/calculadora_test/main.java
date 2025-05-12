/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_test;

/**
 *
 * @author 34685
 */
public class main {
    public static void main(String[] args) {
        
        Calculadora calc=new Calculadora();
        System.out.println("-----Prueba método multiplicación-----");
        System.out.println("multiplación de 2x50 :" +calc.multipicacion(2, 50));
        System.out.println("-----Prueba método factorial----- ");
        System.out.println(" factorial de 5 :"+calc.factorial(5));
       
    }
    
}
