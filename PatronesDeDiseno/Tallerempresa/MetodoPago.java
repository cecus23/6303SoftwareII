package PatronesDeDiseno.Tallerempresa;

public class MetodoPago {
    private String tipo; 
    private String detalles; 

    public MetodoPago(String tipo, String detalles) {
        this.tipo = tipo;
        this.detalles = detalles;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDetalles() {
        return detalles;
    }

    @Override
    public String toString() {
        return tipo + " (" + detalles + ")";
    }
}
