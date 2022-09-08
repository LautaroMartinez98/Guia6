/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("ingrese un numero para buscarlo dentro del vector: ");
        int numero = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (numero == vector[i]) {
                contador++;
                System.out.print("el numero se encuentra en la posicion: " + i);
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
        System.out.println("el numero se repite " + contador + " cantidad de veces");

    }

}
