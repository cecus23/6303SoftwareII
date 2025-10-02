package PatronesDeDiseno.Juegoluchacesar;
public class MainLucha {
    public static void main(String[] args) {
        // Crear personajes específicos
        Personaje p1 = new Asesino("Cesar");
        Personaje p2 = new Hechicero("Marino");

        // Iniciar la pelea
        JuegoLucha juego = new JuegoLucha(p1, p2);
        juego.iniciarPelea();
    }
}
