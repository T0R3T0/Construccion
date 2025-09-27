package cuartel.militares;

public class General extends Militar {
    public General(String nombre, String rango) {
        super(nombre, rango);
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " (General) entrena en planificación y estrategia militar.");
    }

    @Override
    public void reportar() {
        System.out.println(getNombre() + " (General) reporta las estrategias al alto mando.");
    }
}
