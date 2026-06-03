public class CuentaAhorro implements Transferencia, Retiro {
   
    @Override
    public void transferir() {
        System.out.println("Realizando transferencia desde cuenta de ahorros.");
    }
 
    @Override
    public void retirar() {
        System.out.println("Realizando retiro desde cuenta de ahorros.");
    }
}
