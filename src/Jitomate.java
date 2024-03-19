public class Jitomate extends IngredientesDecorator {

    public Jitomate(Baguette pan) {
        super(pan);
    }

    public String getDescripcion() {
        return pan.getDescripcion() + ", Jitomate";
    }

    public double getPrecio() {
        return pan.getPrecio() + 5.5;

    }

}
