/**
 * Clase que representa el ingrediente Catsup para "decorar" (agregarle a) una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Catsup extends IngredientesDecorator {

    /**
     * Constructor de la clase Catsup
     * 
     * @param pan La baguette a decorar con catsup
     */
    public Catsup(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con catsup
     * 
     * @return La descripción de la baguette con catsup
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Catsup";
    }

    /**
     * Obtiene el precio de la baguette con catsup
     * 
     * @return El precio de la baguette con catsup
     */
    public double getPrecio() {
        return pan.getPrecio() + 2;
    }
}
