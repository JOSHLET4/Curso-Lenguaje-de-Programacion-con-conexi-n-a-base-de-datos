package conexion_con_bd;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class clase2 {
    clase1 list = new clase1();
    clase1 crea = new clase1();
    clase1 modifi = new clase1();
    clase1 elimi = new clase1();
    Integer id;
    String nombre;
    String apellido;
    Integer edad;
    Double nota;
    
    
    public void menu () {
        
        while (true){
            
            System.out.println("----------------------------");
            System.out.println("| 1. Mostrar lista de estudiantes |");
            System.out.println("| 2. Crear nuevo estudiante |");
            System.out.println("| 3. Actualizar datos de estudiante |");
            System.out.println("| 4. Eliminar estudiante |");
            System.out.println("| 5. Salir |");
            //Scanner sp = new Scanner(System.in);
            String ingresar = JOptionPane.showInputDialog("Ingrese una opción");
                int opcion = Integer.parseInt(ingresar);
            
            //switch (sp.nextInt()) {
            switch (opcion) {
                case 1:
                    System.out.println("Lista de Estudiantes:");
                    list.listar();
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    //System.out.println("Ingresa el nombre");
                    //nombre = sp.next();
                    //sp.nextLine();
                    apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                    //System.out.println("Ingresa el apellido");                   
                    //apellido = sp.nextLine();
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    //System.out.println("Ingresa la edad");
                    //edad = sp.nextInt();
                    //sp.nextLine();
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota promedio"));
                    //System.out.println("Ingresa la nota promedio");
                    //nota = sp.nextDouble();
                    crea.crear(nombre, apellido, edad, nota);
                    System.out.println("Registro agregado con éxito\n");
                    break;
                case 3:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota promedio"));
                    //System.out.println("Ingresa el ID del estudiante");
                    //id = sp.nextInt();
                    //sp.nextLine();
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    //System.out.println("Ingresa el nombre");
                    //nombre = sp.nextLine();
                    apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                    //System.out.println("Ingresa el apellido");
                    //apellido = sp.next();
                    //sp.nextLine();
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    //System.out.println("Ingresa la edad");
                    //edad = sp.nextInt();
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota promedio"));
                    //System.out.println("Ingresa la nota promedio");
                    //nota = sp.nextDouble();
                    modifi.modificar(id, nombre, apellido, edad, nota);
                    System.out.println("Registro modificado con éxito\n");
                    break;
                case 4:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota promedio"));
                    //System.out.println("Ingresa el usuario que desea eliminar");
                    //id = sp.nextInt();
                    elimi.eliminar(id);
                    System.out.println("Registro eliminado con éxito\n");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        clase2 menu = new clase2();
        menu.menu();
    }
}
