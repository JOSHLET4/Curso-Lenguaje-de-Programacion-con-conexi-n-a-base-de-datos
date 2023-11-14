import java.util.Scanner;
public class clase6poo {
    clase6 cuenta1 = new clase6 (500, "german");
    clase6 cuenta2 = new clase6 (1000, "Isabella");
    
    public void menu () {
        
        while (true) {
            System.out.println("----------------------------");
            System.out.println("| 1. Mostrar cuenta |");
            System.out.println("| 2. Abonar cuenta |");
            System.out.println("| 3. Debitar cuenta |");
            System.out.println("| 4. Salir cuenta |");
            Scanner sp = new Scanner(System.in);
            
            switch (sp.nextInt()) {
                case 1:
                    System.out.println("Deseas cuenta 1 o 2?");
                    if (sp.nextInt() == 1) {
                        cuenta1.mostrar();
                    }else{
                        cuenta2.mostrar();
                    }
                    break;
                case 2:
                    System.out.println("Deseas cuenta 1 o 2?");
                    if (sp.nextInt() == 1) {
                        System.out.println("Ingresa el monto a abonar");
                        cuenta1.abonar(sp.nextDouble());
                    }else{
                        System.out.println("Ingresa el monto a abonar");
                        cuenta2.abonar(sp.nextDouble());
                    }
                    break;
                case 3:
                    System.out.println("Deseas cuenta 1 o 2?");
                    if (sp.nextInt() == 1) {
                        System.out.println("Ingresa el monto a debitar");
                        cuenta1.debitar(sp.nextDouble());
                    }else{
                        System.out.println("Ingresa el monto a debitar");
                        cuenta2.debitar(sp.nextDouble());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
                
            }
        }
    }
    
    public static void main(String[] args) {
        clase6poo dato = new clase6poo ();
        dato.menu();
    }
    
}
