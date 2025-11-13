package PatronesDeDiseno.Proyecto;

public class Main {
    public static void main(String[] args) {

        Workout workout = new Workout.Builder()
                .nombre("Entrenamiento de Fuerza")
                .tipo(TipoWorkout.FUERZA)
                .intensidad(Intensidad.ALTA)
                .duracion(45)
                .agregarEjercicio(new Ejercicio("Sentadillas", 4, 12))
                .agregarEjercicio(new Ejercicio("Press de pecho", 4, 10))
                .agregarEjercicio(new Ejercicio("Peso muerto", 4, 8))
                .construir();

        SesionEntrenamiento sesion = new SesionEntrenamiento(workout);

        ContadorEstadisticas stats = new ContadorEstadisticas();
        SistemaNotificaciones noti = new SistemaNotificaciones();
        BarraProgreso barra = new BarraProgreso(3);

        sesion.agregarObservador(stats);
        sesion.agregarObservador(noti);
        sesion.agregarObservador(barra);

        sesion.iniciarWorkout();
        sesion.completarEjercicio();
        sesion.completarEjercicio();
        sesion.completarEjercicio();
        sesion.finalizarSesion();

        stats.mostrarResumen();
        noti.mostrarNotificaciones();
    }
}
