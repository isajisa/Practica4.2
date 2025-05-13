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
        
        System.out.println("-----Prueba método suma-----");
        System.out.println("suma de 30+20 :" +calc.multipicacion(30, 20));
        
        System.out.println("-----Prueba método multiplicación-----");
        System.out.println("multiplación de 2x50 :" +calc.multipicacion(2, 50));
        System.out.println("-----Prueba método factorial----- ");
        System.out.println(" factorial de 5 :"+calc.factorial(5));
        
        System.out.println("-----Prueba método restar-----");
        System.out.println("restar de 50-20 : " + calc.restar(50, 20));
        
        System.out.println("-----Prueba método division-----");
        System.out.println("division de 10/5 : " + calc.dividir(10, 5));
       
    }
    
}
