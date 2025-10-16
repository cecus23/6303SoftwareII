package PatronesDeDiseno.Tallerempresa;

import java.util.ArrayList;
import java.util.List;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos = new ArrayList<>();

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Impresión a color: " + color);
        for (Foto f : fotos) {
            f.print();
        }
    }

    @Override
    public double getPrecio() {
        return fotos.size() * 2.5;
    }
}
