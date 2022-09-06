/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una cantidad de euros: ");
        float euro = leer.nextFloat();
        System.out.println("ingrese el tipo de moneda que desea convertir: ");
        String moneda = leer.next();
        conversion(euro, moneda);
    }
    public static void conversion (float euro, String moneda) {
        switch(moneda) {
            case "yenes" : 
                System.out.println("la cantidad de yenes es: "+ euro * 129.852);
                break;
            case "dolares":
                System.out.println("la cantidad de dolares es: "+ euro * 1.28611);
                break;
            case "libra":
                System.out.println("la cantidad de libras es: "+ euro * 0.86);
                break;
            default: 
                System.out.println("moneda invalida");
                      
        }
               
             
    }

}
