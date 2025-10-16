package PatronesDeDiseno.Tallerempresa;

public abstract class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public abstract void mostrarDetalle();

    public abstract double getPrecio();
}
