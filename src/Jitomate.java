/**
 * Clase que representa el ingrediente Jitomate para "decorar" (agregarle a) una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Jitomate extends IngredientesDecorator {

    /**
     * Constructor de la clase Jitomate
     * 
     * @param pan La baguette a decorar con jitomate
     */
    public Jitomate(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con Jitomate
     * 
     * @return La descripción de la baguette con jitomate
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Jitomate";
    }

    /**
     * Obtiene el precio de la baguette con Jitomate
     * 
     * @return El precio de la baguette con jitomate
     */
    public double getPrecio() {
        return pan.getPrecio() + 5.5;

    }

}
