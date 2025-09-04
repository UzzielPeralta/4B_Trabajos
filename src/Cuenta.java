public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}