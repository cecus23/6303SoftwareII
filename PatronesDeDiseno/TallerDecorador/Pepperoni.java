package PatronesDeDiseno.TallerDecorador;

// Decorador concreto
class Pepperoni extends IngredienteExtra {
    Pizza pizza;

    public Pepperoni(Pizza p) {
        this.pizza = p;
    }

    public String getDescripcion() {
        return pizza.getDescripcion() + ", Pepperoni";
    }

    public double costo() {
        return pizza.costo() + 2.0;
    }
}
