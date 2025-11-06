package PatronesDeDiseno.TallerObservador;

public class Seguidor implements Observador {
    private String nombre;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String nombreUsuario, String publicacion) {
        System.out.println(" " + nombre + " recibió notificación: "
                + nombreUsuario + " publicó \"" + publicacion + "\"");
    }
}

