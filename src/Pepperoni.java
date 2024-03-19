public class Pepperoni extends IngredientesDecorator {
    public Pepperoni(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Pepperoni";
    }

    public double getPrecio() {
        return pan.getPrecio() + 10;

    }

}
