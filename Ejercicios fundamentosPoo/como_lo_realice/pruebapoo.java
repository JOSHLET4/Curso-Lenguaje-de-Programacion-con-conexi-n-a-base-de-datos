import java.util.Scanner;

public class pruebapoo {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("¿Desea hacer un debito o abono? ");
        String tipoDeTransaccion = sp.nextLine();

        ejerciciopoo cuenta1 = new ejerciciopoo(1, "Josue", "Letran", "Ahorro", 3030);
        ejerciciopoo cuenta2 = new ejerciciopoo(2, "Julia", "Hernandez", "monetario", 4040);
                
            while ("debito".equals(tipoDeTransaccion)) {
                System.out.println("Ingrese el monto a debitar cuenta 1 : ");
                cuenta1.debito1 = sp.nextInt();
                System.out.println("Transacción exitosa: " + cuenta1.debitar(cuenta1.debito1));
                System.out.println("Nuevo saldo cuenta 1: " + cuenta1.saldo1 + "\n" + "Saldo cuenta 2: " + cuenta2.saldo2 + "\n");
                System.out.println("Ingrese el monto a debitar cuenta 2 : ");
                cuenta2.debito2 = sp.nextInt();
                System.out.println("Transacción exitosa: " + cuenta2.debitar(cuenta2.debito2));
                System.out.println("Saldo cuenta 1: " + cuenta1.saldo1 + "\n" + "Nuevo saldo cuenta 2: " + cuenta2.saldo2 + "\n");
           }
            while ("abono".equals(tipoDeTransaccion)) {
                System.out.println("Ingrese el monto a abonar cuenta 1 : ");
                cuenta1.abono1 = sp.nextInt();
                System.out.println("Transacción exitosa: " + cuenta1.abonar(cuenta1.abono1));
                System.out.println("Nuevo saldo cuenta 1: " + cuenta1.saldo1 + "\n" + "Saldo cuenta 2: " + cuenta2.saldo2 + "\n");
                System.out.println("Ingrese el monto a abonar cuenta 2 : ");
                cuenta2.abono2 = sp.nextInt();
                System.out.println("Transacción exitosa: " + cuenta2.abonar(cuenta2.abono2));
                System.out.println("Saldo cuenta 1: " + cuenta1.saldo1 + "\n" + "Nuevo saldo cuenta 2: " + cuenta2.saldo2 + "\n");
            }      
}
}
