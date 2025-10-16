package PatronesDeDiseno.Tallerempresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        System.out.println("Pedido de: " + cliente);
        for (Producto p : productos) {
            p.mostrarDetalle();
        }
        System.out.println("Total: $" + calcularTotal());
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
}
