import java.util.List;
import java.util.ArrayList;
public class Planeta extends Astro {
    private Double distanciaSol;
    private Double orbitaSol;
    private List<Satelite> satelites;

    public Planeta(String nombre, Double rotacionEje, Double masa, Double temperaturaMedia, Double gravedad, Double distanciaSol, Double orbitaSol) {
        super(nombre, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.satelites = new ArrayList<>();
    }

    //MOSTRAMOS INFO
    @Override
    public void muestra() {
        System.out.println("Datos del Planeta:");
        System.out.println("Nombre del planeta " + getNombre());
        System.out.println("Rotación del eje: " + getRotacionEje());
        System.out.println("Masa: " + getMasa());
        System.out.println("Temperatura Media: " + getTemperaturaMedia());
        System.out.println("Gravedad: " + getGravedad());
        System.out.println("Distancia al Sol: " + getDistanciaSol());
        System.out.println("Orbita al Sol: " + getOrbitaSol());
        System.out.println("--------------------------");
        System.out.println("Satelites que tiene: ");
        if(satelites.size() == 0){
            System.out.println("No hay satelites");
        } else {
            getSatelites();
        }
        System.out.println("--------------------------");
    }

    //Añadimos Satelite (Setter)
    public void AnyadirSatelite(Satelite satelite){
        satelites.add(satelite);
    }

    //GETTERS Y SETTERS
    public Double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(Double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public Double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(Double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public void getSatelites() {
        for(Satelite satelite : satelites) {
            System.out.println(satelite.getNombre());
        }
    }

}
