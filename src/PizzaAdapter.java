/**
 * Clase PizzaAdapter que implementa a Baguette y nos ayuda a
 * ser un intermediarion entre pizzas y Baguettes, para poder imprimir
 * un ticket estandar de ambas.
 */
public class PizzaAdapter implements Baguette {
    Pizza pizza;

    /**
     * Constructor PizzaAdapter que nos ayuda a construir un adaptador
     * de una pizza.
     * 
     * @param pizza, la pizza que queremos adaptar.
     */
    public PizzaAdapter(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Metodo getDescripcion que sobreescribe el metodo del mismo nombre
     * de Baguette, este metodo llama a getTicket de pizza para poder
     * imprimir un ticket sin importar si son pizzas o baguettes.
     */
    @Override
    public String getDescripcion() {
        return pizza.getTicket(pizza);
    }

    /**
     * Metodo getPrecio que sobreescribe al metodo homonimo de Baguette
     * 
     * @returns un double que nos dice el precio de las pizzas.
     */
    @Override
    public double getPrecio() {
        return pizza.getPrecio();
    }
}
