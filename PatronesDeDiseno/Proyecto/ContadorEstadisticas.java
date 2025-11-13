package PatronesDeDiseno.Proyecto;

public class ContadorEstadisticas implements Observador {
    private int totalEjercicios = 0;
    private int totalSesiones = 0;

    @Override
    public void actualizar(String mensaje) {
        if (mensaje.contains("iniciada")) totalSesiones++;
        if (mensaje.contains("Ejercicio completado")) totalEjercicios++;
    }

    public void mostrarResumen() {
        System.out.println("Sesiones: " + totalSesiones + " | Ejercicios: " + totalEjercicios);
    }
}