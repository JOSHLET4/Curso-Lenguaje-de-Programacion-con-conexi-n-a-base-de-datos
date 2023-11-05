//Pedir tres números y mostrarlos ordenados de mayor a menor
import java.util.Scanner;
        
public class ejercicio4_if_switch {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int valor1 = sp.nextInt();
        System.out.println("Ingrese el segundo número:");
        int valor2 = sp.nextInt();
        System.out.println("Ingrese el tercer número:");
        int valor3 = sp.nextInt();
        System.out.println("Los números ordenados de mayor a menor son:");
        
        if (valor1>=valor2 && valor2>=valor3) {
            System.out.println(valor1 + ", " + valor2 + ", " + valor3);
        }else if (valor2>=valor1 && valor1>=valor3) {
            System.out.println(valor2 + ", " + valor1 + ", " + valor3);
        }else if (valor3>=valor2 && valor2>=valor1) {
            System.out.println(valor3 + ", " + valor2 + ", " + valor1);
        }else if (valor1>=valor3 && valor3>=valor2) {
            System.out.println(valor1 + ", " + valor3 + ", " + valor2);
        }else if (valor2>=valor3 && valor3>=valor1) {
            System.out.println(valor2 + ", " + valor3 + ", " + valor1);
        }else {
            System.out.println(valor3 + ", " + valor1 + ", " + valor2);
        }
    }
}
