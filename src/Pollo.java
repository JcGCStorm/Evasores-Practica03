public class Pollo extends IngredientesDecorator {

    public Pollo(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Pollo";
    }

    public double getPrecio() {
        return pan.getPrecio() + 40;
    }
}
