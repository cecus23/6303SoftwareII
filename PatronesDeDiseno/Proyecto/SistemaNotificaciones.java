package PatronesDeDiseno.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotificaciones implements Observador {
    private List<String> notificaciones = new ArrayList<>();

    @Override
    public void actualizar(String mensaje) {
        notificaciones.add(mensaje);
    }

    public void mostrarNotificaciones() {
        System.out.println("Notificaciones:");
        for (String n : notificaciones) System.out.println(" - " + n);
    }
}