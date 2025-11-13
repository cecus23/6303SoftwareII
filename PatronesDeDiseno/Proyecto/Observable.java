package PatronesDeDiseno.Proyecto;

public interface Observable {
    void agregarObservador(Observador obs);
    void notificar(String mensaje);
}
