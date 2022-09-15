/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de hijos de todas las familias.*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class extra14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de familias");
        int numF = entrada.nextInt();
        int max = 0, suma = 0, sumaE = 0;
        int[] vector = new int[numF];

        for (int i = 0; i < numF; i++) {
            System.out.println("Ingres el numero de hijos de la familia " + (i + 1));
            int numH = entrada.nextInt();
            vector[i] = numH;
            if (vector[i] > max) {
                max = vector[i];
                suma += vector[i];
            }

        }

        int[][] matriz = new int[numF][max];

        for (int i = 0; i < numF; i++) {

            for (int j = 0; j < max; j++) {
                if (j == vector[i]) {
                    break;
                }
                System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i);
                int edadH = entrada.nextInt();
                matriz[i][j] = edadH;
                sumaE += matriz[i][j];//System.out.print("["+matriz[i][j]+"]");

            }

        }
        System.out.println("La media de edad de los hijos de todas las familias es " + sumaE / suma);

    }
}
