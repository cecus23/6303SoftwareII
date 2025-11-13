package PatronesDeDiseno.Proyecto;

public class Ejercicio {
    private String nombre;
    private int series;
    private int repeticiones;

    public Ejercicio(String nombre, int series, int repeticiones) {
        this.nombre = nombre;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public void mostrar() {
        System.out.println(" - " + nombre + " (" + series + "x" + repeticiones + ")");
    }
}
