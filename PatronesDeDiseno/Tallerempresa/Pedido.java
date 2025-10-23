package PatronesDeDiseno.Tallerempresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;
    private MetodoPago metodoPago;

    
    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.fecha = builder.fecha;
        this.productos = builder.productos;
        this.metodoPago = builder.metodoPago;
    }

    public void mostrarPedido() {
        System.out.println("======================================");
        System.out.println("Pedido de: " + cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Método de pago: " + metodoPago);
        System.out.println("--------------------------------------");
        for (Producto p : productos) {
            p.mostrarDetalle();
        }
        System.out.println("--------------------------------------");
        System.out.println("Total: $" + calcularTotal());
        System.out.println("======================================");
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    
    public static class Builder {
        private Cliente cliente;
        private Date fecha = new Date(); 
        private MetodoPago metodoPago;
        private List<Producto> productos = new ArrayList<>();

        public Builder setCliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder setMetodoPago(MetodoPago metodoPago) {
            this.metodoPago = metodoPago;
            return this;
        }

        public Builder agregarProducto(Producto producto) {
            this.productos.add(producto);
            return this;
        }

        public Pedido build() {
            if (cliente == null) {
                throw new IllegalStateException("El pedido debe tener un cliente asignado.");
            }
            if (metodoPago == null) {
                throw new IllegalStateException("Debe seleccionarse un método de pago.");
            }
            return new Pedido(this);
        }
    }
}


