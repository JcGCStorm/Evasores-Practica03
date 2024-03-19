/**
 * Clase que representa el ingrediente Mostaza para "decorar" (agregarle a) una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Mostaza extends IngredientesDecorator {
    /**
     * Constructor de la clase Mostaza
     * 
     * @param pan La baguette a decorar con cebolla
     */
    public Mostaza(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con mostaza
     * 
     * @return La descripción de la baguette con mostaza
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Mostaza";
    }

    /**
     * Obtiene el precio de la baguette con mostaza
     * 
     * @return El precio de la baguette con mostaza
     */
    public double getPrecio() {
        return pan.getPrecio() + 2;

    }
}
