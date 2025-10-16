package PatronesDeDiseno.Tallerempresa;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("123456", "Cesar cuero");
        Pedido pedido = new Pedido(cliente, new Date(), 987654321);

        Producto camara = ProductoFactory.crearProducto("camara", 1, "Canon", "EOS R5");
        Producto impresion = ProductoFactory.crearProducto("impresion", 2, "Color");

        if (impresion instanceof Impresion) {
            ((Impresion) impresion).agregarFoto(new Foto("cumpleaños.jpg"));
            ((Impresion) impresion).agregarFoto(new Foto("futbol.jpg"));
        }

        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);

        pedido.mostrarPedido();
    }
}
