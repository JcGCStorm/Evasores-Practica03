public abstract class IngredientesDecorator implements Baguette {
    protected Baguette pan;

    public IngredientesDecorator(Baguette pan) {
        this.pan = pan;

    }

    public String getDescripcion() {
        return pan.getDescripcion();
    }

    public double getPrecio() {
        return pan.getPrecio();

    }

}