/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/

package Guia6;

//@author Usuario

import java.util.Scanner;

public class extra23 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       
       String frase;
       
       String [][] matriz=new String [20][20];
       String[] vector = new String[5];
       int posF;
        for (int i = 0; i < 5; i++) {
              
       do{
           System.out.println("ingrese frase");
           frase=leer.next();
           
       }while(frase.length()<3 || frase.length()>5);
       vector[i]=frase;
        }
        
        for (int i = 0; i < 5; i++) {
             posF=(int) (Math.random()*20); 
             for (int j = 0; j < vector[i].length(); j++) {
                 if(matriz[posF][j]==null){
                matriz[posF][j]=vector[i].substring(j,j+1);
                 }else {
                     i--;
                 break;
                 }
                 
                 }           
        }
        
        
        
    }
    
}

    



