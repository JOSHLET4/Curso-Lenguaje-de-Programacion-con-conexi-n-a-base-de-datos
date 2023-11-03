//Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el area de la
//circunferencia = 2*PI*radio, area de la circunferencia = PI*Radio^2
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        float radio = sp.nextFloat();
        float longitud = (float) (2*Math.PI*radio);
        float area = (float) (Math.PI*radio*radio);
        System.out.println("La longitud es: " + longitud + " y el area es: " + area);
    }
}
