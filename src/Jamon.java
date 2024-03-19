public class Jamon extends IngredientesDecorator {
    public Jamon(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Jamon";
    }

    public double getPrecio() {
        return pan.getPrecio() + 10;

    }

}
