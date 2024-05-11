public abstract class Astro {
    private String nombre;
    private Double rotacionEje;
    private Double masa;
    private Double temperaturaMedia;
    private Double gravedad;

    public Astro(String nombre, Double rotacionEje, Double masa, Double temperaturaMedia, Double gravedad){
        this.nombre = nombre;
        this.rotacionEje = rotacionEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    //GETTES Y SETTERS
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getRotacionEje(){
        return rotacionEje;
    }
    public void setRotacionEje(Double rotacionEje){
        this.rotacionEje = this.rotacionEje;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(Double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public Double getGravedad() {
        return gravedad;
    }

    public void setGravedad(Double gravedad) {
        this.gravedad = gravedad;
    }

    //METODO ABSTRACTO
    public abstract void muestra();
}
