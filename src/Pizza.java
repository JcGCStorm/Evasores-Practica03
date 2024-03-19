/**
 * Clase Pizza que representa a las pizzas de Don cangrejo
 * Una pizza tiene un precio, tiene un tipo de queso (Manchego o Cheddar),
 * Un tipo de carne (Salchicha, Jamón o Pollo) y un tipo de masa (Masa delgada o
 * Masa gruesa)
 */
public class Pizza {
    Pizza pizza;

    /**
     * Constructor de la clase Pizza que nos ayuda a crear una pizza.
     * 
     * @param pizza
     */
    public Pizza(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Atributos de la clase Pizza, son Strings que representan todos los
     * ingredientes de las pizzas.
     */
    double precio = 0;
    String queso;
    String carne;
    String masa;

    /**
     * Metodo getPrecio, que como su nombre lo indica nos dice
     * el precio de la pizza.
     * 
     * @return precio, el precio de la pizza.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo getQueso que nos devuelve una string con el tipo de queso que
     * contiene la pizza
     * 
     * @return String que representa al queso.
     */
    public String getQueso() {
        return queso;
    }

    /**
     * Metodo getCarne que nos devuelve una string con el tipo de carne que
     * contiene la pizza
     * 
     * @return String que representa a la carne de la pizza.
     */
    public String getCarne() {
        return carne;
    }

    /**
     * Metodo getMasa que nos devuelve una string con el tipo de masa que
     * contiene la pizza
     * 
     * @return String que representa a la masa de la pizza.
     */
    public String getMasa() {
        return masa;
    }

    /**
     * Metodo getTicket que nos devuelve el ticket de la pizzas de DonCangrejo
     * contiene la pizza
     * 
     * @return String que representa al queso.
     */
    public String getTicket(Pizza pizza) {
        return "\n Masa:" + pizza.getMasa() + "\n Carne:" + pizza.getCarne()
                + "\n Queso:" + pizza.getQueso();
    }
}
