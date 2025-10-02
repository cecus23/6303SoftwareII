package PatronesDeDiseno.Juegoluchacesar;
class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje j1, Personaje j2) {
        this.jugador1 = j1;
        this.jugador2 = j2;
    }

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " +
                jugador1.getNombre() + " y " + jugador2.getNombre() + "...");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() +
                ". Puntos de vida de " + defensor.getNombre() + ": " +
                defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " +
                defensor.getPuntosDeVida() + " puntos de vida.");
    }
}