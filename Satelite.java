public class Satelite extends Astro {
    private Double distanciaPlaneta;
    private Double orbitaPlanteria;
    private String planetaPertenece;

    public Satelite(String nombre, Double rotacionEje, Double masa, Double temperaturaMedia, Double gravedad, Double distanciaSol, Double orbitaPlanteria, String planetaPertenece) {
        super(nombre, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaSol;
        this.orbitaPlanteria = orbitaPlanteria;
        this.planetaPertenece = planetaPertenece;
    }

    //MOSTRAR INFO
    @Override
    public void muestra(){
        System.out.println("Datos del satelite:");
        System.out.println("Nombre del satelite " + getNombre());
        System.out.println("Rotación del eje: " + getRotacionEje());
        System.out.println("Masa: " + getMasa());
        System.out.println("Temperatura Media: " + getTemperaturaMedia());
        System.out.println("Gravedad: " + getGravedad());
        System.out.println("--------------------------");
        System.out.println("Planeta al que pertenece: " + getPlanetaPertenece());
        System.out.println("Distancia al planeta: " + getDistanciaPlaneta());
        System.out.println("Orbita Planetaria: " + getOrbitaPlanteria());
        System.out.println("--------------------------");
    }

    //GETTES Y SETTERS
    public Double getDistanciaPlaneta(){
        return distanciaPlaneta;
    }
    public void setDistanciaPlaneta(Double distanciaPlaneta){
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public Double getOrbitaPlanteria() {
        return orbitaPlanteria;
    }
    public void setOrbitaPlanteria(Double orbitaPlanteria) {
        this.orbitaPlanteria = orbitaPlanteria;
    }

    public String getPlanetaPertenece() {
        return planetaPertenece;
    }
    public void setPlanetaPertenece(String planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }

}
