/**
 * Clase que representa el ingrediente Lechuga para "decorar" (agregarle a) una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Lechuga extends IngredientesDecorator {
    /**
     * Constructor de la clase Lechuga
     * 
     * @param pan La baguette a decorar con lechuga
     */
    public Lechuga(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con Lechuga
     * 
     * @return La descripción de la baguette con lechuga
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Lechuga";
    }

    /**
     * Obtiene el precio de la baguette con Lechuga
     * 
     * @return El precio de la baguette con lechuga
     */
    public double getPrecio() {
        return pan.getPrecio() + 5.5;

    }

}
