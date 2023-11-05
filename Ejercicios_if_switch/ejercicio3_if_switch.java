//Pedir dos números y mostrarlos de mayor a menor
import java.util.Scanner;

public class ejercicio3_if_switch {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int valor1 = sp.nextInt();
        System.out.println("Ingrese el segundo número");
        int valor2 = sp.nextInt();
        System.out.println("Los valores de mayor a menor son: \n");
        
        if (valor1>=valor2) {
            System.out.println(" " + valor1 + ", " + valor2);
        }else {
            System.out.println(" " + valor2 + ", " + valor1);
        }
    }
    
}
