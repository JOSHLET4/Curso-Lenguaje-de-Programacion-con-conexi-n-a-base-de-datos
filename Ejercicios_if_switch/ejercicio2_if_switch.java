//Pedir un número e indicar si es positivo o negativo
import java.util.Scanner;

public class ejercicio2_if_switch {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int valor1 = sp.nextInt();
        
        if (valor1>=0) {
            System.out.println("El número introducido es positivo");
        }else if (valor1<0) {
            System.out.println("El número introducido es negativo");
        }else {
            System.out.println("Por favor introduzca un número");
        }
    }
}
