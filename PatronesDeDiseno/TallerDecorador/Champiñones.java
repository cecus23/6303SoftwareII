package PatronesDeDiseno.TallerDecorador;

// Decorador concreto
class Champiñones extends IngredienteExtra {
    Pizza pizza;

    public Champiñones(Pizza p) {
        this.pizza = p;
    }

    public String getDescripcion() {
        return pizza.getDescripcion() + ", Champiñones";
    }

    public double costo() {
        return pizza.costo() + 1.0;
    }
}

