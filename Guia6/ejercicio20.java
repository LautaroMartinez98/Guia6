/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class ejercicio20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean comparacion = true;
        int[][] matriz = new int[3][3];
        int num = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                do {
                    System.out.println("Ingrese el numero" + i + "," + j);
                    num = entrada.nextInt();
                    matriz[i][j] = num;

                } while (num < 1 || num > 9);

            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        int suma = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println(suma);
        System.out.println("");

        int suma1;
        for (int i = 1; i < 3; i++) {
            suma1 = 0;
            for (int j = 0; j < 3; j++) {
                suma1 = suma1 + matriz[i][j];

            }
            if (suma != suma1) {
                comparacion = false;
                break;
            }

        }
        if (comparacion) {

            for (int j = 0; j < 3; j++) {
                suma1 = 0;
                for (int i = 0; i < 3; i++) {
                    suma1 = suma1 + matriz[i][j];

                }
                if (suma != suma1) {
                    comparacion = false;
                    break;
                }

            }
        }
        if (comparacion) {
            suma1 = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        suma1 = suma1 + matriz[i][j];

                    }

                }

            }
            if (suma != suma1) {
                comparacion = false;

            }

        }

        if (comparacion) {
            suma1 = 0;
            int j = 2;
            for (int i = 0; i < 3; i++) {
                suma1 = suma1 + matriz[i][j];
                j--;

            }
            if (suma != suma1) {
                comparacion = false;

            }

        }

        if (comparacion) {
            System.out.println("la matriz es magica");
        } else {
            System.out.println("la matriz no es magica");
        }

    }
}
        
    



