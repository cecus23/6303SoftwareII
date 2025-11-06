package PatronesDeDiseno.TallerDecorador;

class BordeRelleno extends IngredienteExtra {
    Pizza pizza;

    public BordeRelleno(Pizza p) {
        this.pizza = p;
    }

    public String getDescripcion() {
        return pizza.getDescripcion() + ", Borde relleno de queso";
    }

    public double costo() {
        return pizza.costo() + 2.5;
    }
}
