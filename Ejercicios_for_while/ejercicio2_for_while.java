// Crear un programa que muestre los numeros impares, en los intervalos del 1 al 10
package clase_de_for_y_while;

public class ejercicio2_for_while {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            
            if (i%2==1) {
                System.out.println("El número es impar: " + i);
            }
            
        }
    }
}
