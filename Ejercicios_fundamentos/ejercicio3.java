//Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número 
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        int valor = sp.nextInt();
        int valorDoble = valor*2;
        int valorTriple = valor*3;
        System.out.println("El doble del número ingresado es: " + valorDoble + " y el triple es: "+ valorTriple);
    }
}
