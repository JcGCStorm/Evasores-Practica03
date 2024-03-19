/**
 * Clase PizzaCarnesFrias que extiende a la clase Pizza y es una
 * representación de una pizza especifica. Cuenta unicamente con su
 * constructor, que sobreescribe los atributos de su clase padre.
 * 
 * @Extends Pizza
 */
public class PizzaCarnesFrias extends Pizza {

    /**
     * Constructor de la clase PizzaCarnesfrias, lo único que
     * hace es poner nuevos valores a los de su clase padre.
     * 
     * @param pizza la pizza Carnes Frias.
     */
    public PizzaCarnesFrias(Pizza pizza) {
        super(pizza);
        super.precio = 120.50;
        super.queso = "Manchego";
        super.carne = "Salchicha y Jamón";
        super.masa = "Masa Delgada";
    }
}