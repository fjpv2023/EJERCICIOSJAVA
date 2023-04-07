/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2act2;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Clase2act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    */
       Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("Ingrese su nombre");
       nombre = leer.nextLine();
       System.out.println("Hola " +  nombre);
       
       **Act1
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, result;
        
        System.out.println("Ingrese dos numeros entros");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        result = num1 + num2;
        System.out.println("La suma de los numeros es: " + result);
     
       /*act1
       Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("Ingrese su nombre");
       nombre = leer.nextLine();
       System.out.println("Hola " +  nombre);
       /act2
        *Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la frase");
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());      
            
        
        
        
        
    }
    
}
