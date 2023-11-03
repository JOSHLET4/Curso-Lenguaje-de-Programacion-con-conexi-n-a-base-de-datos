//Programa que lea una cantidad de grados centigrados y la pase a grados Fahrenheit. la formula corrspondiente es: F = 32 + (9 * C / 5)
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        float gradosCentigrados = sp.nextFloat();
        float gradosFahrenheit = 32+(9*gradosCentigrados/5);
        System.out.println("Conversión a grados Fahrenheit: "+ gradosFahrenheit);
    }
}
