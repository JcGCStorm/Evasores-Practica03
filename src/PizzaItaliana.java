/**
 * Clase PizzaItaliana que extiende a la clase Pizza y es una
 * representación de una pizza especifica. Cuenta unicamente con su
 * constructor, que sobreescribe los atributos de su clase padre.
 * 
 * @Extends Pizza
 */
public class PizzaItaliana extends Pizza {
    /**
     * Constructor de la clase PizzaItaliana, lo único que
     * hace es poner nuevos valores a los de su clase padre.
     * 
     * @param pizza la pizza Italiana.
     */
    public PizzaItaliana(Pizza pizza) {
        super(pizza);
        super.precio = 210.00;
        super.queso = "Manchego";
        super.carne = "Salchicha y Jamón";
        super.masa = "Masa Delgada";
    }
}