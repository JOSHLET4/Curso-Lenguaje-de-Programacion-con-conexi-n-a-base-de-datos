
public class ejerciciopoo {
    int numeroCuenta;
    String nombreTitular;
    String apellido;
    String tipoCuenta;
    int dpi;
    double saldo1;
    double saldo2;
    double debito1;
    double debito2;
    double abono;
    double abono1;
    double abono2;

    public ejerciciopoo(int numerocuenta, String nombreTitular, String apellido, String tipoCuenta, int dpi) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.apellido = apellido;
        this.tipoCuenta = tipoCuenta;
        this.dpi = dpi;
        this.saldo1 = 500;
        this.saldo2 = 300;
    }

    public boolean debitar(double debitarCuenta) {
        this.saldo1 -= debitarCuenta;
        this.saldo2 -= debitarCuenta;
        return true;
    }

    public boolean abonar(double abonarCuenta) {
        this.saldo1 += abonarCuenta;
        this.saldo2 += abonarCuenta;
        return true;
    }
}