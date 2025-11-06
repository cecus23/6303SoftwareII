package PatronesDeDiseno.TallerObservador;

import java.util.*;

public interface Sujeto {
    void registrarObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificarObservadores(String publicacion);
}

