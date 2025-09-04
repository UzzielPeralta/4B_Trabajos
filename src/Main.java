import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta miCuenta = new Cuenta(100.0);

        Deposito deposito = new Deposito();
        Retiro retiro = new Retiro();

        int opcion;

        do {
            System.out.println("\n--- MENÚ DEL BANCO ---");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuánto depositaras?: ");
                    double montoDeposito = scanner.nextDouble();
                    deposito.hacerDeposito(miCuenta, montoDeposito);
                    break;
                case 2:
                    System.out.print("¿Cuánto retiraras?: ");
                    double montoRetiro = scanner.nextDouble();
                    retiro.hacerRetiro(miCuenta, montoRetiro);
                    break;