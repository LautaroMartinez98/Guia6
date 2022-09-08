package Guia6;

//@author Usuario
public class ejercicio17 {

    public static void main(String[] args) {
        int[] vector = new int[99000];
        int unDigitos = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999);
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= 0 && vector[i] < 10) {
                unDigitos++;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                dosDigitos++;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                tresDigitos++;
            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                cuatroDigitos++;
            } else {
                cincoDigitos++;
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");

        }
        System.out.println("");
        System.out.println("La cantidad de numeros con un digito es: " + unDigitos);
        System.out.println("La cantidad de numeros con dos digito es: " + dosDigitos);
        System.out.println("La cantidad de numeros con tres digito es: " + tresDigitos);
        System.out.println("La cantidad de numeros con cuatro digito es: " + cuatroDigitos);
        System.out.println("La cantidad de numeros con cinco digito es: " + cincoDigitos);

    }

}
