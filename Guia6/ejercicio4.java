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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       System.out.println("ingrese los grados centigrados: ");
       Double grados = leer.nextDouble();
       Double F = 32 + (9 * grados / 5);
        System.out.println("el equivalente en grados Fahrenheit es: "+ F);
               
    }
    
}
