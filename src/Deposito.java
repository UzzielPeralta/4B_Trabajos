public class Deposito {
    public void hacerDeposito(Cuenta cuenta, double cantidad) {
        cuenta.depositar(cantidad);
        System.out.println("Has depositado: $" + cantidad);
    }
}