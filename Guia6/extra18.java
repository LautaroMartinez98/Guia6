/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class extra18 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("indique el tamaño que desea darle al vector: ");
        int tamaño = leer.nextInt();
        int [] vector = new int [tamaño];
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese un valor");
            vector[i]=leer.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        System.out.println("la suma de todos los valores del vector es: "+suma);
        
    }


}
