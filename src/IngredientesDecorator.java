/**
 * Clase abstracta que sirve como base para decoradores de ingredientes de
 * baguettes
 * Implementa la interfaz Baguette
 */
public abstract class IngredientesDecorator implements Baguette {
    protected Baguette pan;

    /**
     * Constructor de la clase IngredientesDecorator
     * 
     * @param pan La baguette a decorar con ingredientes
     */
    public IngredientesDecorator(Baguette pan) {
        this.pan = pan;

    }

    /**
     * Obtiene la descripción de la baguette decorada con ingredientes
     * 
     * @return La descripción de la baguette decorada con ingredientes
     */
    public String getDescripcion() {
        return pan.getDescripcion();
    }

    /**
     * Obtiene el precio de la baguette decorada con ingredientes
     * 
     * @return El precio de la baguette decorada con ingredientes
     */
    public double getPrecio() {
        return pan.getPrecio();
    }

}