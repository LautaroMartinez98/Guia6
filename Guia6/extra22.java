/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class extra22 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño de la matriz: ");
        int tamaño1 = leer.nextInt();
        int tamaño2 = leer.nextInt();
        int [][] matriz = new int[tamaño1][tamaño2];
        int suma= 0;
        rellenar (matriz, tamaño1, tamaño2, suma);
    }
    public static void rellenar (int [][] matriz, int tamaño1, int tamaño2, int suma) {
        for (int i = 0; i < tamaño1; i++) {
            for (int j = 0; j < tamaño2; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+",");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < tamaño1; i++) {
            for (int j = 0; j < tamaño2; j++) {
               suma+= matriz[i][j];
            }
        }
        System.out.println("la suma de los elementos de las matrices es: "+ suma);
    }

}
