package PatronesDeDiseno.Tallerempresa;

public class ProductoFactory {

    public static Producto crearProducto(String tipo, int numero, String... params) {
        switch (tipo.toLowerCase()) {
            case "camara":
                if (params.length >= 2) {
                    return new Camara(numero, params[0], params[1]);
                } else {
                    throw new IllegalArgumentException("Faltan parámetros para crear una Cámara.");
                }

            case "impresion":
                if (params.length >= 1) {
                    return new Impresion(numero, params[0]);
                } else {
                    throw new IllegalArgumentException("Faltan parámetros para crear una Impresión.");
                }

            default:
                throw new IllegalArgumentException("Tipo de producto no reconocido: " + tipo);
        }
    }
}
