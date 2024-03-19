/**
 * Clase que representa el ingrediente Mayonesa para "decorar" (agregarle a) una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Mayonesa extends IngredientesDecorator {

    /**
     * Constructor de la clase Mayonesa
     * 
     * @param pan La baguette a decorar con mayonesa
     */
    public Mayonesa(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con Mayonesa
     * 
     * @return La descripción de la baguette con mayonesa
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Mayonesa";
    }

    /**
     * Obtiene el precio de la baguette con mayonesa
     * 
     * @return El precio de la baguette con mayonesas
     */
    public double getPrecio() {
        return pan.getPrecio() + 2;

    }
}
