public class Main{
    public static void main(String[] args) {
        Limpieza aseo = new PersonalAseo();
        Reparacion rep = new Tecnico();
        aseo.limpiar();
        rep.reparar();
    }
}