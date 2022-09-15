/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

package Guia6;

//@author Usuario

import java.util.Scanner;


public class extra8 {

    public static void main(String[] args) {
        int num=1, pares=0, impar=0, cantidad=0;

        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese 0 para salir del programa");
        do{
            System.out.println("Ingrese un numero");
            num= leer.nextInt();
            if (num<0){
                continue;
            }
            if (num%5==0){
                break;
            }else if (num>0){
                cantidad++;  
                if(num%2==0){
                    pares++;
                }else{
                    impar++;
                }
            }
           
            
        }while (num!=0);
        System.out.println(" La cantidad de numeros es de: "+ cantidad+ "// La cantidad de pares es de: "+ pares+ "// La cantidad de impares es de: "+ impar);
    }

    }



