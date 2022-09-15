/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/
package Guia6;

//@author Usuario
import java.util.Scanner;

public class extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese si es socio A, B o C.");
        String socio = leer.nextLine();
        int precio = 5000;
        switch (socio) {
            case "A":
                System.out.println("el precio inicial del tratamiento es "+ precio + " y el monto a abonar por un socio clase A es de "+ precio/2);
                break;
            case "B":
                System.out.println("el precio inicial del tratamiento es "+ precio + " y el monto a abonar por un socio clase B es de "+ (precio-(precio*0.35)));
                break;
            case "C":
                System.out.println("el precio del tratamiento es "+ precio);
                break;
            default:
                System.out.println("la letra ingresada no es valida ");
        }
    }

}
