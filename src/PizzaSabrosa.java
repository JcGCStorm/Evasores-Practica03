public class PizzaSabrosa extends Pizza {
    public PizzaSabrosa(Pizza pizza) {
        super(pizza);
        super.nombre = "Pizza Sabrosa";
        super.precio = 150.5;
        super.descripcion = "Pizza con orilla rellena de Queso, Jamón, Pepperoni y ahorita agrego más.";
    }
}
