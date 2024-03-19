/**
 * Clase que representa el ingrediente Pepperoni para "decorar" (agregarle a)
 * una
 * baguette
 * Extiende de IngredientesDecorator
 */
public class Pepperoni extends IngredientesDecorator {

    /**
     * Constructor de la clase Pepperoni
     * 
     * @param pan La baguette a decorar con pepperoni
     */
    public Pepperoni(Baguette pan) {
        super(pan);
    }

    /**
     * Obtiene la descripción de la baguette con pepperono
     * 
     * @return La descripción de la baguette con pepperoni
     */
    public String getDescripcion() {
        return pan.getDescripcion() + ", Pepperoni";
    }

    /**
     * Obtiene el precio de la baguette con pepperoni
     * 
     * @return El precio de la baguette con pepperoni
     */
    public double getPrecio() {
        return pan.getPrecio() + 10;

    }

}
