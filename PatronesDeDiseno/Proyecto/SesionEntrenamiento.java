package PatronesDeDiseno.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class SesionEntrenamiento implements Observable {
    private List<Observador> observadores = new ArrayList<>();
    private Workout workoutActual;
    private int ejerciciosCompletados = 0;
    private boolean enCurso = false;

    public SesionEntrenamiento(Workout workout) {
        this.workoutActual = workout;
    }

    @Override
    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void notificar(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public void iniciarWorkout() {
        enCurso = true;
        notificar("Sesión iniciada: " + workoutActual);
    }

    public void completarEjercicio() {
        ejerciciosCompletados++;
        notificar("Ejercicio completado (" + ejerciciosCompletados + ")");
    }

    public void finalizarSesion() {
        enCurso = false;
        notificar("Sesión finalizada con " + ejerciciosCompletados + " ejercicios completados.");
    }
}
