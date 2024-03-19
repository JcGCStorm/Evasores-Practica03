/**
 * Clase PizzaHawaiana que extiende a la clase Pizza y es una
 * representación de una pizza especifica. Cuenta unicamente con su
 * constructor, que sobreescribe los atributos de su clase padre.
 * 
 * @Extends Pizza
 */
public class PizzaHawaiana extends Pizza {
    /**
     * Constructor de la clase PizzaHawaiana, lo único que
     * hace es poner nuevos valores a los de su clase padre.
     * 
     * @param pizza la pizza Hawaiana.
     */
    public PizzaHawaiana(Pizza pizza) {
        super(pizza);
        super.precio = 200.00;
        super.queso = "Cheddar";
        super.carne = "Salchicha y Jamón";
        super.masa = "Masa Gruesa";
    }
}