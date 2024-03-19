/**
 * Clase que representa el ingrediente Cebolla para "decorar" (agregarle a) una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Cebolla extends IngredientesDecorator {

    /**
     * Constructor de la clase Cebolla
     * 
     * @param pan La baguette a decorar con cebolla
     */
    public Cebolla(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con cebolla
     * 
     * @return La descripción de la baguette con cebolla
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Cebolla";
    }

    /**
     * Obtiene el precio de la baguette con cebolla
     * 
     * @return El precio de la baguette con cebolla
     */
    public double getPrecio() {
        return pan.getPrecio() + 5.5;
    }
}
