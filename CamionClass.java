public class CamionClass implements ConducirInterface, TrasportadorInterface{
    @Override
    public void conducir() {
        System.out.println("El camión está circulando por la carretera.");
    }
 
    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancías.");
    }
}
