//Crear un programa que muestre las tablas de multiplicar del 1 al 10. (Realizarla con while)
package clase_de_for_y_while;

public class ejercicio4_for_while {
    
    public static void main(String[] args) {
        int numero2 = 1;

        while (numero2 <= 10) {
            int numero = 1;
            System.out.println("\n TABLA DEL " + numero2);
            while (numero <= 10) {
                System.out.println(numero2 + " X " + numero + " = " + (numero2 * numero));
                numero++;
            }
            numero2++;
        }
    }
}
