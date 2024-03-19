public class PizzaAdapter implements Baguette {
    private final Pizza pizza;

    public PizzaAdapter(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getNombre() {
        return pizza.getNombre();
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio();

    }

}