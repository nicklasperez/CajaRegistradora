interface Transaccionable {
    void abrirCaja(double montoInicial);
    double calcularCambio(double montoPagado, double precioTotal);
    double consultarDineroEnCaja();
}
