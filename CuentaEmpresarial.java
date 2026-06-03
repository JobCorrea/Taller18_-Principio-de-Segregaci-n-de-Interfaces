class CuentaEmpresarial implements PagoFactura {
    @Override
    public void pagar() {
        System.out.println("Realizando pago de factura empresarial.");
    }
}