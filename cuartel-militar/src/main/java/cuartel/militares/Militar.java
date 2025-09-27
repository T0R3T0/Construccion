package cuartel.militares;

public abstract class Militar {
    private String nombre;
    private String rango;

    public Militar(String nombre, String rango) {
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getNombre() { return nombre; }
    public String getRango() { return rango; }

    public abstract void entrenar();
    public abstract void reportar();
}
