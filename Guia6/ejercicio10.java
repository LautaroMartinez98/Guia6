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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLimite;
        int num;
        int suma=0;
       Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero limite");
        numLimite = entrada.nextInt();
        
        while(suma<=numLimite){
            System.out.println("Ingrese numero a sumar");
            num = entrada.nextInt();
            suma=suma+num;
            
        }
        
        
        System.out.println("la suma es " + suma);

    }
    
}
