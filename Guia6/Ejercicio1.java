/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
     Scanner leer = new Scanner (System.in);
     System.out.println("Ingrese dos numeros para sumar ");
     //int tipo de dato:enteros
     int numero1 = leer.nextInt();
     int numero2 = leer.nextInt();
     
     System.out.println("la suma de ambos numeros es: "+ (numero1 + numero2));
    
             
    }
    
}
