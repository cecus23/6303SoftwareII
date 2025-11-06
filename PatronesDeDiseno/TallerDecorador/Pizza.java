package PatronesDeDiseno.TallerDecorador;


abstract class Pizza {
    String descripcion = "Pizza desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}
