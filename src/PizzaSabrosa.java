/**
 * Clase PizzaSabrosa que extiende a la clase Pizza y es una
 * representación de una pizza especifica. Cuenta unicamente con su
 * constructor, que sobreescribe los atributos de su clase padre.
 * 
 * @Extends Pizza
 */
public class PizzaSabrosa extends Pizza {

    /**
     * Constructor de la clase PizzaSabrosa, lo único que
     * hace es poner nuevos valores a los de su clase padre.
     * 
     * @param pizza la pizza mas sabrosa de la vida.
     */
    public PizzaSabrosa(Pizza pizza) {
        super(pizza);
        super.precio = 150.5;
        super.queso = "Cheddar";
        super.carne = "Jamón y Pollo";
        super.masa = "Masa Gruesa";
    }
}
