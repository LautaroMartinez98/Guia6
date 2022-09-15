/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class extra3 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una letra: ");
        String letra = leer.nextLine();
        if (letra.equalsIgnoreCase("A")|| letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("la letra es una vocal. ");
        } 
        else {
            System.out.println("la letra es una consonante. ");
        }
    }


}
