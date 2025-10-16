package PatronesDeDiseno.Tallerempresa;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("123456", "Cesar cuero");
        Pedido pedido = new Pedido(cliente, new Date(), 987654321);

        Camara camara = new Camara(1, "Canon", "EOS R5");
        Impresion impresion = new Impresion(2, "Color");
        impresion.agregarFoto(new Foto("cumpleaños.jpg"));
        impresion.agregarFoto(new Foto("playa.jpg"));

        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);

        pedido.mostrarPedido();
    }
}
