package PatronesDeDiseno.TallerDecorador;

class QuesoExtra extends IngredienteExtra {
    Pizza pizza;

    public QuesoExtra(Pizza p) {
        this.pizza = p;
    }

    public String getDescripcion() {
        return pizza.getDescripcion() + ", Queso Extra";
    }

    public double costo() {
        return pizza.costo() + 1.5;
    }
}
