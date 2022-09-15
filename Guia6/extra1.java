/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una cantidad de minutos: ");
        int minutos = leer.nextInt();
        int[] resultado = equivalente(minutos);
        System.out.println("la cantidad de días es: " + resultado[0] );
        System.out.println("y "+ resultado[1] + " horas");
    }

    public static int[] equivalente(int minutos) {
        int días = minutos / 1440;
        minutos %= 1440;
        int horas = minutos / 60;
        minutos %= 60;

        int[] tiempo = {días, horas};

        return tiempo;
    }

}
