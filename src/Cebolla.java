public class Cebolla extends IngredientesDecorator {

    public Cebolla(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Cebolla";
    }

    public double getPrecio() {
        return pan.getPrecio() + 5.5;

    }
}
