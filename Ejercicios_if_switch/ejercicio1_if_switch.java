//Realizar un programa que pida dos números y que nos diga si son iguales o no
import java.util.Scanner;
public class ejercicio1_if_switch {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int valor1 = sp.nextInt();
        System.out.println("Ingrese el segundo número");
        int valor2 = sp.nextInt();
        
        if (valor1 == valor2) {
            System.out.println("Los números son iguales");
        }else {
            System.out.println("Los números NO son iguales");
        }
    }
}
