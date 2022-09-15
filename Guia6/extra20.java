/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
package Guia6;

//@author Usuario

import java.util.Scanner;

public class extra20 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector ");
        int tamaño = leer.nextInt();
        int vector[]=new int [tamaño];
        rellene(vector);
        imprima(vector);
    }

    public static void rellene(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*9);
        }
    }
    public static void imprima(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }

}
