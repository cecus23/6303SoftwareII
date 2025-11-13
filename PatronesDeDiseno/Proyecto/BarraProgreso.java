package PatronesDeDiseno.Proyecto;

public class BarraProgreso implements Observador {
    private int ejerciciosTotales;
    private int ejerciciosActuales = 0;

    public BarraProgreso(int ejerciciosTotales) {
        this.ejerciciosTotales = ejerciciosTotales;
    }

    @Override
    public void actualizar(String mensaje) {
        if (mensaje.contains("Ejercicio completado")) {
            ejerciciosActuales++;
            mostrarBarra();
        }
    }

    public void mostrarBarra() {
        double progreso = (double) ejerciciosActuales / ejerciciosTotales * 100;
        System.out.printf("Progreso: %.1f%% (%d/%d)\n", progreso, ejerciciosActuales, ejerciciosTotales);
    }
}