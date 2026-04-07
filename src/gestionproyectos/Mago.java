public class Mago extends Tarea {

    private String nombre;
    private int mana;

    public void lanzarHechizo() {
    System.out.println(nombre + " lanza un hechizo");
}

    public Mago(String nombre, int mana) {
        this.nombre = nombre;
        this.mana = mana;
    }
}