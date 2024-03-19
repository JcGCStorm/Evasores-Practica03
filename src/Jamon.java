/**
 * Clase que representa el ingrediente Jamon para "decorar" (agregarle a) una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Jamon extends IngredientesDecorator {
    /**
     * Constructor de la clase Jamon
     * 
     * @param pan La baguette a decorar con jamon
     */
    public Jamon(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con Jamon
     * 
     * @return La descripción de la baguette con jamon
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Jamon";
    }

    /**
     * Obtiene el precio de la baguette con jamon
     * 
     * @return El precio de la baguette con jamon
     */
    public double getPrecio() {
        return pan.getPrecio() + 10;

    }

}
