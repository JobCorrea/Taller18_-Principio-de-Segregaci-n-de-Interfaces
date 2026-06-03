class CuentaCorriente implements Transferencia, Retiro, PagoFactura {
    @Override
    public void transferir() {
        System.out.println("Realizando transferencia desde cuenta corriente.");
    }
 
    @Override
    public void retirar() {
        System.out.println("Realizando retiro desde cuenta corriente.");
    }
 
    @Override
    public void pagar() {
        System.out.println("Realizando pago de factura desde cuenta corriente.");
    }
}