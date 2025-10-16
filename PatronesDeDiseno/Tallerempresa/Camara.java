package PatronesDeDiseno.Tallerempresa;

public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Cámara: " + marca + " " + modelo);
    }

    @Override
    public double getPrecio() {
        return 660.0;
    }
}
