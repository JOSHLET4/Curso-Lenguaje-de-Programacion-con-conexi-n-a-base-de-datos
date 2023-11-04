//Programa Java que lea dos números enteros por teclado y los muestre por pantalla
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        int valor1 = sp.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int valor2 = sp.nextInt();
        System.out.println("2 valores ingresados: "+valor1 + " y " + valor2);
    }
}
