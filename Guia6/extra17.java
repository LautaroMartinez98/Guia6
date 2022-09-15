/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class extra17 {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("ingese numero");
        int num=leer.nextInt();
        
        System.out.println(esprimo(num));
    }
    public static boolean esprimo(int num){
        boolean primo=false;
        int c=0;
        
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
            c++;
            }
        }
        
        if(c==2){
          primo=true;
        }
        
       return primo;
    }
    
}
