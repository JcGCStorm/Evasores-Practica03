public class Lechuga extends IngredientesDecorator {
    public Lechuga(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Lechuga";
    }

    public double getPrecio() {
        return pan.getPrecio() + 5.5;

    }

}
