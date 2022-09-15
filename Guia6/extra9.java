/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class extra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, residuo = 0, cociente = 0;
        System.out.println("ingrese los numeros a dividir: ");
        dividendo = leer.nextInt();
        divisor = leer.nextInt();
        while (dividendo < divisor) { 
            System.out.println("ingrese un divisor mas chico que el dividendo ");
            divisor = leer.nextInt();
        }
        do {
                
            residuo = dividendo - divisor;
            dividendo = residuo;
            cociente++;
        } while (residuo >= divisor);
        System.out.println("el residuo es " + residuo + " y el cociente es " + cociente);

    }

}
