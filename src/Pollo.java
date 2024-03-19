/**
 * Clase que representa el ingrediente Pollo para "decorar" (agregarle a)
 * una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Pollo extends IngredientesDecorator {

    /**
     * Constructor de la clase Pollo
     * 
     * @param pan La baguette a decorar con pollo
     */
    public Pollo(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con pollo
     * 
     * @return La descripción de la baguette con pollo
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Pollo";
    }

    /**
     * Obtiene el precio de la baguette con pollo
     * 
     * @return El precio de la baguette con pollo
     */
    public double getPrecio() {
        return pan.getPrecio() + 40;
    }
}
