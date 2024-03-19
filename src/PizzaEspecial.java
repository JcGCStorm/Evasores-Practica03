/**
 * Clase PizzaEspecial que extiende a la clase Pizza y es una
 * representación de una pizza especifica. Cuenta unicamente con su
 * constructor, que sobreescribe los atributos de su clase padre.
 * 
 * @Extends Pizza
 */
public class PizzaEspecial extends Pizza {
    /**
     * Constructor de la clase PizzaEspecial, lo único que
     * hace es poner nuevos valores a los de su clase padre.
     * 
     * @param pizza la pizza Especial.
     */
    public PizzaEspecial(Pizza pizza) {
        super(pizza);
        super.precio = 300.00;
        super.queso = "Manchego";
        super.carne = "Jamon, Pollo y Salchicha";
        super.masa = "Masa Gruesa";
    }
}