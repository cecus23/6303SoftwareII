package PatronesDeDiseno.TallerObservador;

import java.util.*;

public class Usuario implements Sujeto {
    private String nombre;
    private List<Observador> seguidores;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.seguidores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void registrarObservador(Observador o) {
        seguidores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        seguidores.remove(o);
    }

    @Override
    public void notificarObservadores(String publicacion) {
        for (Observador seguidor : seguidores) {
            seguidor.actualizar(nombre, publicacion);
        }
    }

    public void publicar(String mensaje) {
        System.out.println(" " + nombre + " publicó: " + mensaje);
        notificarObservadores(mensaje);
    }
}

