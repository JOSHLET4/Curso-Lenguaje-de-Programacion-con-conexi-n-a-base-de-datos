
public class clase6 {
    double saldo;
    String nombre;

    public clase6(double saldo, String nombre) {
        this.saldo = saldo;
        this.nombre = nombre;
    }

    clase6() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String abonar (double saldo) {
        this.saldo += saldo;
        return "Se abono a la cuenta" + saldo + "Saldo actual " + this.saldo;
    }
    public void debitar (double saldo) {
        this.saldo -= saldo;
        System.out.println("Se abono a la cuenta" + saldo + "Saldo actual " + this.saldo);
        }
    
    public void mostrar (){
        System.out.println("Su saldo actual es: " + this.saldo);
    }

    void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
