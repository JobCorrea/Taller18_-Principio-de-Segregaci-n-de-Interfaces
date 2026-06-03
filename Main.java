public class Main{
    public static void main(String[] args) {
        Limpieza aseo = new PersonalAseo();
        Reparacion rep = new Tecnico();
        aseo.limpiar();
        rep.reparar();
        System.out.println();

        System.out.println("=== EJERCICIO 2: Operaciones Bancarias ===");
        CuentaAhorro ahorros = new CuentaAhorro();
        ahorros.transferir();
        ahorros.retirar();
        System.out.println("----------------");
        CuentaEmpresarial empresarial = new CuentaEmpresarial();
        empresarial.pagar();
        System.out.println("----------------");
        CuentaCorriente corriente = new CuentaCorriente();
        corriente.transferir();
        corriente.retirar();
        corriente.pagar();
        System.out.println();
 
    }
}