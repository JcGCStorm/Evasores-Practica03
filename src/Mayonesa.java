public class Mayonesa extends IngredientesDecorator {

    public Mayonesa(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Mayonesa";
    }

    public double getPrecio() {
        return pan.getPrecio() + 2;

    }
}
