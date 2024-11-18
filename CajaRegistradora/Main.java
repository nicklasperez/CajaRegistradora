import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double cantInicial;

        CajaRegistradora caja = new CajaRegistradora();

        System.out.println();

        System.out.print("Introduzca cantidad inicial de dinero en caja: ");
        cantInicial = scanner.nextDouble();
        caja.abrirCaja(cantInicial);
        System.out.println();


        System.out.print("Introduzca precio total de compra: ");
        Double precioTotal = scanner.nextDouble();
        System.out.println();

        
        System.out.print("Introduzca cuanto ha pagado: ");
        double montoPagado = scanner.nextDouble();
        System.out.println();

        
        double cambio = caja.calcularCambio(montoPagado, precioTotal);

        caja.imprimirRecibo(precioTotal, montoPagado, cambio);

        double dineroEnCajaDespues = caja.consultarDineroEnCaja() + precioTotal;
        System.out.println("Dinero disponible en la caja después de la transacción: " + dineroEnCajaDespues + " euros.");

        scanner.close();
    }
}
