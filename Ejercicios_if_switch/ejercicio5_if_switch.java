//Pedir el día, mes y año de una fecha e indicar si la fecha escorrecta con meses de 28, 30, 31 dias sin años bisiestos
import java.util.Scanner;
        
public class ejercicio5_if_switch {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el mes:");
        int mes = sp.nextInt();
        System.out.println("Ingrese el día:");
        int dia = sp.nextInt();
        System.out.println("Ingrese el año");
        int anio = sp.nextInt();
        System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
        
        if (mes<=12) {
            switch (mes) {
                case 1:
                    System.out.println("Mes correcto: " + mes + " Enero");
                    break;
                case 2:
                    System.out.println("Mes Correcto: " + mes + " Febrero");
                    break;
                case 3:
                    System.out.println("Mes Correcto: " + mes + " Marzo");
                    break;
                case 4:
                    System.out.println("Mes Correcto: " + mes + " Abril");
                    break;
                case 5:
                    System.out.println("Mes Correcto: " + mes + " Mayo");
                    break;
                case 6:
                    System.out.println("Mes Correcto: " + mes + " Junio");
                    break;
                case 7:
                    System.out.println("Mes Correcto: " + mes + " Julio");
                    break;
                case 8:
                    System.out.println("Mes Correcto: " + mes + " Agosto");
                    break;
                case 9:
                    System.out.println("Mes Correcto: " + mes + " Septiembe");
                    break;
                case 10:
                    System.out.println("Mes Correcto: " + mes + " Octubre");
                    break;
                case 11:
                    System.out.println("Mes Correcto: " + mes + " Noviembre");
                    break;
                case 12:
                    System.out.println("Mes Correcto: " + mes + " Diciembre");
                    break;
                }
        }else if (mes>12) {
            System.out.println("El mes es incorrecto");    
        }
        if (dia<=0) {
            System.out.println("Ingrese un día válido: " + dia);
        }else if (mes==1 && dia<=31) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==2 && dia<=28) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==3 && dia<=31) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==4 && dia<=30) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==5 && dia<=31) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==6 && dia<=30) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==7 && dia<=31) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==8 && dia<=31) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==9 && dia<=30) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==10 && dia<=31) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==11 && dia<=30) {
            System.out.println("dias correctos: " + dia);
        }else if (mes==12 && dia<=31) {
            System.out.println("dias correctos: " + dia);
        }else {
            System.out.println("Ingrese un día válido: " + dia);
        }
        if (anio>=1) {
            System.out.println("El año es correcto: " + anio);
        }
    }
}