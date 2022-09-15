/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class extra15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("que operacion desea realizar: ");
        System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n" +
        "5. Salir");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                sumar(num1, num2, leer);
                break;
            case 2:
                restar(num1, num2, leer);
                break;
            case 3:
                multiplicacion(num1, num2, leer);
                break;
            case 4:
                division(num1, num2, leer);
                break;
            default:
                System.out.println("fin");

        }

    }

    public static void sumar(int num1, int num2, Scanner leer) {
        System.out.println("la suma es " + (num1 + num2));
    }

    public static void restar(int num1, int num2, Scanner leer) {
        System.out.println("la resta es " + (num1 - num2));
    }

    public static void multiplicacion(int num1, int num2, Scanner leer) {
        System.out.println("la multiplicacion es " + (num1 * num2));
    }

    public static void division(int num1, int num2, Scanner leer) {
        System.out.println("la division es " + (num1 / num2));
    }

}
