package PatronesDeDiseno.TallerObservador;

public class Main {
    public static void main(String[] args) {
        Usuario juan = new Usuario("Juan");
        Usuario maria = new Usuario("María");

        Observador ana = new Seguidor("Ana");
        Observador pedro = new Seguidor("Pedro");
        Observador laura = new Seguidor("Laura");

        
        juan.registrarObservador(ana);
        juan.registrarObservador(pedro);

    
        maria.registrarObservador(laura);

        
        juan.publicar("¡Buenos días a todos!");
        System.out.println("---------------------");
        maria.publicar("Hoy empiezo un nuevo proyecto de arte.");
    }
}

