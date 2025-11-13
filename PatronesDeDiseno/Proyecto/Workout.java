package PatronesDeDiseno.Proyecto;

import java.util.ArrayList;

public class Workout {
    private String nombre;
    private TipoWorkout tipo;
    private Intensidad intensidad;
    private int duracion;
    private ArrayList<Ejercicio> ejercicios;

    private Workout(Builder builder) {
        this.nombre = builder.nombre;
        this.tipo = builder.tipo;
        this.intensidad = builder.intensidad;
        this.duracion = builder.duracion;
        this.ejercicios = builder.ejercicios;
    }

    public void mostrarInfo() {
        System.out.println("Workout: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Intensidad: " + intensidad);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Ejercicios:");
        for (Ejercicio e : ejercicios) e.mostrar();
    }

    public static class Builder {
        private String nombre;
        private TipoWorkout tipo;
        private Intensidad intensidad;
        private int duracion;
        private ArrayList<Ejercicio> ejercicios = new ArrayList<>();

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder tipo(TipoWorkout tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder intensidad(Intensidad intensidad) {
            this.intensidad = intensidad;
            return this;
        }

        public Builder duracion(int duracion) {
            this.duracion = duracion;
            return this;
        }

        public Builder agregarEjercicio(Ejercicio ejercicio) {
            this.ejercicios.add(ejercicio);
            return this;
        }

        public Workout construir() {
            return new Workout(this);
        }
    }
}

