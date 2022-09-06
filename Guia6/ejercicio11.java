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
public class ejercicio11 {

    /**
     * @param args the command line arguments5
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opc;
        String resp = "N";
        do {
            System.out.println("MENU\n"
                    + "1.Sumar\n"
                    + "2.Restar\n"
                    + "3.Multiplicar\n"
                    + "4.Dividir\n"
                    + "5.Salir\n"
                    + "Elija una opción.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La división entre " + num1 + " y " + num2 + " es " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Estás seguro que deseas salir del sistema?(S/N)");
                    resp = leer.next();
                    
                default:
                    System.out.println("Has ingresado una opción invalida.");
                   
            }
        }while(!(resp.equals("S")));
    }
}