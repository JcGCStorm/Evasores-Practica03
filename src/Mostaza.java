public class Mostaza extends IngredientesDecorator {
    public Mostaza(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Mostaza";
    }

    public double getPrecio() {
        return pan.getPrecio() + 2;

    }
}
