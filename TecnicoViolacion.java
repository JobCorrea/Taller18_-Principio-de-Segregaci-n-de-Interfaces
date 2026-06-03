public class TecnicoViolacion implements Mantenimiento{
    @Override
    public void reparar() {
        System.out.println("El técnico está reparando el equipo.");
    }
 
    @Override
    public void limpiar() {
        // Implementación vacía: el técnico no debería limpiar. VIOLA EL ISP.
    }
}
