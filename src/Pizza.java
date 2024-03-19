public class Pizza extends PizzaAdapter {

    public Pizza(Pizza pizza) {
        super(pizza);
    }

    String nombre;
    double precio;
    String descripcion;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
