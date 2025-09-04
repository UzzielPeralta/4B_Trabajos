public class Retiro {
    public void hacerRetiro(Cuenta cuenta, double cantidad) {
        cuenta.retirar(cantidad);
        System.out.println("Has retirado: $" + cantidad);
    }
}