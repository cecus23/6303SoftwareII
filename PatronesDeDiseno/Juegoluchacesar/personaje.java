package PatronesDeDiseno.Juegoluchacesar;
import java.util.Random;

// Clase base
class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected int minDano;
    protected int maxDano;

    public Personaje(String nombre, int puntosDeVida, int minDano, int maxDano) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.minDano = minDano;
        this.maxDano = maxDano;
    }

    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((maxDano - minDano) + 1) + minDano;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() +
                " causando " + dano + " puntos de daño.");
    }

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
