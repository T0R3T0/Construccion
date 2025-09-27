package cuartel.militares;

public class Soldado extends Militar {
    public Soldado(String nombre, String rango) {
        super(nombre, rango);
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " (Soldado) entrena en combate cuerpo a cuerpo y armas.");
    }

    @Override
    public void reportar() {
        System.out.println(getNombre() + " (Soldado) reporta el cumplimiento de la misión en el campo.");
    }
}
