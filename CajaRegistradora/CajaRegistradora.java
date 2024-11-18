public class CajaRegistradora implements Transaccionable, Imprimible {
    private double dineroEnCaja;

    public void abrirCaja(double montoInicial) {
        dineroEnCaja = montoInicial;
    }

    public double calcularCambio(double montoPagado, double precioTotal) {
        return montoPagado - precioTotal;
    }

    public double consultarDineroEnCaja() {
        return dineroEnCaja;
    }

    public void imprimirRecibo(double precioTotal, double montoPagado, double cambio) {
        System.out.println("Recibo:");
        System.out.println("Total de la compra: " + precioTotal + " euros.");
        System.out.println("Monto pagado: " + montoPagado + " euros.");
        System.out.println("Cambio: " + cambio + " euros." );
    }
}
