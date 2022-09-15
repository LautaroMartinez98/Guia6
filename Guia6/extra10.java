/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado = ((int)(Math.random()*10)+1)* ((int)(Math.random()*10)+1);
        System.out.println("el resultado es "+ resultado);
        System.out.println("ingrese cual es la respuesta: ");
        int respuesta = leer.nextInt();
        while (respuesta != resultado){
            System.out.println("respuesta incorrecta, ingrese otra respuesta"); 
            respuesta=leer.nextInt();
           } 
        System.out.println("respuesta correcta");
        
    }
}

