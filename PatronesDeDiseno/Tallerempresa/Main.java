package PatronesDeDiseno.Tallerempresa;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("123456", "Cesar Cuero");

        
        MetodoPago metodoPago = new MetodoPago("Tarjeta de crédito", "Visa terminada en 4321");

        
        Camara camara = new Camara(1, "Canon", "EOS R5");
        Impresion impresion = new Impresion(2, "Color");
        impresion.agregarFoto(new Foto("cumpleaños.jpg"));
        impresion.agregarFoto(new Foto("futbol.jpg"));

        
        Pedido pedido = new Pedido.Builder()
                .setCliente(cliente)
                .setFecha(new Date())
                .setMetodoPago(metodoPago)
                .agregarProducto(camara)
                .agregarProducto(impresion)
                .build();

        
        pedido.mostrarPedido();
    }
}


