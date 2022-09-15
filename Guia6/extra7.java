/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantos numeros quiere calcular? ");
        int n = leer.nextInt();
        int maximo = 0;
        int minimo= 0;
        int suma = 0;
        int contador = 0;
        int numero = 1;
        while (contador != n) {
            System.out.println("ingrese un numero: ");
            numero = leer.nextInt();
            if (numero < 0) {
            break;
            }
            if (contador == 0){
             minimo= numero;}
            if (numero < minimo) {
                minimo = numero;
            } else if (numero > maximo) {
                maximo = numero;
            }
            contador++;
            suma+=numero;

        }
        System.out.println("el minimo es "+ minimo);
        System.out.println("el maximo es "+ maximo);
        System.out.println("el promedio es "+ suma/n);
    }

}
