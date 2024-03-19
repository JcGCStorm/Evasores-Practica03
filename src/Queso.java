public class Queso extends IngredientesDecorator {

    public Queso(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + "Queso";
    }

    public double getPrecio() {
        return pan.getPrecio() + 3.5;

    }
}
