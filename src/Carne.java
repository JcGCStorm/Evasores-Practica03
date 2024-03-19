public class Carne extends IngredientesDecorator {
    public Carne(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Carne";
    }

    public double getPrecio() {
        return pan.getPrecio() + 40;

    }

}
