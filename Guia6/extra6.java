/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas a para medir su altura:");
        int personas = leer.nextInt();
        promedioaltura(personas, leer);
    }
    
public static void promedioaltura(int personas, Scanner leer){
    double suma=0,suma1=0,bajo=0;
    
    for(int i=1;i<=personas;i++){
        System.out.println("Persona N° "+i+" :");
        double altura = leer.nextDouble();
        if(altura<160){
            suma+=altura;
            bajo++;
        }else{
            suma1+=altura;
            
        }
    }
    System.out.println("El promedio de altura hasta 1,60 es de: "+(suma/bajo)+" cm." );
    System.out.println("El promedio de altura de las "+personas+" personas, es de: "+((suma+suma1)/personas)+" mts.");
}
}