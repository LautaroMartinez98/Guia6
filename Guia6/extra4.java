/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entre 1 y 10 ");
        int numero = leer.nextInt();
        switch (numero) {
            case 1:
                System.out.println("1 en romano es I");
                break;
            case 2:
                System.out.println("2 en romano es II");
                break;
            case 3:
                System.out.println("3 en romano es III");
                break;
            case 4:
                System.out.println("4 en romano es IV");
                break;
            case 5:
                System.out.println("5 en romano es V");
                break;
            case 6:
                System.out.println("6 en romano es VI");
                break;
            case 7:
                System.out.println("7 en romano es VII");
                break;
            case 8:
                System.out.println("8 en romano es VIII");
                break;
            case 9:
                System.out.println("9 en romano es IX");
                break;
            case 10:
                System.out.println("10 en romano es X");
                break;
            default:
                System.out.println("el numero ingresado en invalido");
        }
    }

}
