public class Catsup extends IngredientesDecorator {
    public Catsup(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Catsup";
    }

    public double getPrecio() {
        return pan.getPrecio() + 2;

    }
}
