package PatronesDeDiseno.TallerObservador;

public class Main {
    public static void main(String[] args) {
        Usuario juan = new Usuario("Juan");
        Usuario maria = new Usuario("María");

        Observador ana = new Seguidor("Ana");
        Observador pedro = new Seguidor("Pedro");
        Observador laura = new Seguidor("Laura");

        // Ana y Pedro siguen a Juan
        juan.registrarObservador(ana);
        juan.registrarObservador(pedro);

        // Laura sigue a María
        maria.registrarObservador(laura);

        // Publicaciones
        juan.publicar("¡Buenos días a todos!");
        System.out.println("---------------------");
        maria.publicar("Hoy empiezo un nuevo proyecto de arte.");
    }
}

