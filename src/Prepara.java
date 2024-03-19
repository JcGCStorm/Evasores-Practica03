import java.util.Scanner;

/**
 * Clase Prepara, que nos ayuda a brindarle el menu al cliente
 * y a preparar y cobrar la baguette, o cobrar la pizza del cliente.
 */
public class Prepara {
    Scanner scanner = new Scanner(System.in);
    /**
     * Arreglo de enteros que nos ayuda a llevar la cuenta de cuántos ingredientes
     * ha puesto el cliente, pues solo se puede poner 1, 2 o 3 como máximo.
     */
    int[] ingredientesContador = new int[10];

    /**
     * Metodo preparaBaguette que nos ayuda a preparar la baguette del cliente
     * Este es nuestro metodo decorator pues primero el cliente escoge un pan, el
     * cuál es el chiclocentro de la baguette, una vez escogido el pan lo va a
     * "envolver" según que ingredientes desee el cliente.
     */
    public void preparaBaguette() {
        System.out.println("Selecciona tu pan:");
        System.out.println("1. Pan integral ($15.00)");
        System.out.println("2. Pan de ajo rostizado ($20.00)");
        System.out.println("3. Pan normal ($10.00)");
        System.out.println("4. Pan de avena con miel ($21.00)");
        int panEleccion = scanner.nextInt();

        Baguette baguette;
        switch (panEleccion) {
            case 1:
                baguette = new PanIntegral();
                break;
            case 2:
                baguette = new PanAjoRostizado();
                break;
            case 3:
                baguette = new PanNormal();
                break;
            case 4:
                baguette = new PanAvenaMiel();
                break;
            default:
                System.out.println("No has seleccionado una opción válida, vuélvelo a intentar :D");
                baguette = null;
        }

        if (baguette != null) {

            boolean ponmeMas = true;
            while (ponmeMas) {
                System.out.println("\nElige tus ingredientes (o 0 para finalizar):");
                System.out.println("1. Pollo 🍗($40.00)");
                System.out.println("2. Pepperoni 🔴($10.00)");
                System.out.println("3. Jamon 🐖($10.00)");
                System.out.println("4. Jitomate 🍅($5.50)");
                System.out.println("5. Cebolla 🧅($5.50)");
                System.out.println("6. Lechuga 🥬($5.50)");
                System.out.println("7. Mostaza 🟡($2.00)");
                System.out.println("8. Mayonesa 🥚($2.00)");
                System.out.println("9. Catsup 🥫($2.00)");
                System.out.println("0. Ya tengo suficiente");

                int ingredienteEleccion = scanner.nextInt();
                if (ingredienteEleccion == 0) {
                    ponmeMas = false;
                } else {
                    System.out.println("¿Qué cantidad deseas? 1. Normal 2. Doble 3. Triple");
                    int cantidad = scanner.nextInt();
                    switch (ingredienteEleccion) {
                        case 1:
                            int totalPollo = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalPollo <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Pollo a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de pollito :(");
                            }
                            break;
                        case 2:
                            int totalPepperoni = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalPepperoni <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Pepperoni a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de pepperoni :(");
                            }
                            break;
                        case 3:
                            int totalJamon = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalJamon <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Jamon a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de jamoncito :(");
                            }
                            break;
                        case 4:
                            int totalJitomate = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalJitomate <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Jitomate a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de jitomate :(");
                            }
                            break;
                        case 5:
                            int totalCebolla = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalCebolla <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Cebolla a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de cebolla :(");
                            }
                            break;
                        case 6:
                            int totalLechuga = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalLechuga <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Lechuga a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de lechuga :(");
                            }
                            break;
                        case 7:
                            int totalMostaza = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalMostaza <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Mostaza a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de mostaza :(");
                            }
                            break;
                        case 8:
                            int totalMayonesa = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalMayonesa <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Mayonesa a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de mayonesa :(");
                            }
                            break;
                        case 9:
                            int totalCatsup = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalCatsup <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Catsup a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de catsup :(");
                            }
                            break;
                        case 0:
                            ponmeMas = false;
                            break;
                        default:
                            System.out.println("No seleccionaste una opción válida ):");

                    }
                }
            }
            imprimirTicket(baguette);
        }
    }

    /**
     * Metodo agregarIngrediente que nos ayuda en el Decorator para poder
     * añadir elementos a la baguette, recibe un int y una baguette, y agrega
     * un ingrediente a la baguette.
     * 
     * @param tipoIngrediente un int que nos ayuda a controlar el numero de
     *                        ingredientes.
     * @param baguette        la baguette que vamos a "envolver" con un ingrediente.
     * @return la baguette con el ingrediente agregado.
     */
    private Baguette agregarIngrediente(int tipoIngrediente, Baguette baguette) {
        switch (tipoIngrediente) {
            case 1:
                return new Pollo(baguette);
            case 2:
                return new Pepperoni(baguette);
            case 3:
                return new Jamon(baguette);
            case 4:
                return new Jitomate(baguette);
            case 5:
                return new Cebolla(baguette);
            case 6:
                return new Lechuga(baguette);
            case 7:
                return new Mostaza(baguette);
            case 8:
                return new Mayonesa(baguette);
            case 9:
                return new Catsup(baguette);
            default:
                return baguette;
        }
    }

    /**
     * Metodo preparaPizza que ayuda a que el cliente pueda escoger una pizza.
     * Inicializa todas las pizzas en null y luego manda a llamar al metodo
     * getTicket que
     * nos devuelve unicamente la Descripcion de las pizzas, luego llamamos a su
     * precio para
     * saber cuanto cuestan. Al escoger una pizza el cliente, creamos un adaptador
     * de la pizza
     * deseada y con ese adaptador mandamos a llamar al metodo imprimirTicket que
     * nos va a dar
     * la descripcion y el precio de la pizza deseada.
     */
    public void preparaPizza() {
        PizzaSabrosa sabrosa = new PizzaSabrosa(null);
        PizzaHawaiana hawaiana = new PizzaHawaiana(null);
        PizzaCarnesFrias pizzaCarnesFrias = new PizzaCarnesFrias(null);
        PizzaItaliana pizzaItaliana = new PizzaItaliana(null);
        PizzaEspecial pizzaEspecial = new PizzaEspecial(null);

        System.out.println("Selecciona tu Pizza:");
        System.out.println("1. Pizza Sabrosa" + "\n Descripción: " + sabrosa.getTicket(sabrosa)
                + "\n Precio: " + sabrosa.getPrecio());
        System.out.println("2. Pizza Hawaiana" + "\n Descripción: " + hawaiana.getTicket(hawaiana)
                + "\n Precio: " + hawaiana.getPrecio());
        System.out.println("3. Pizza Carnes Frias" + "\n Descripción: " + pizzaCarnesFrias.getTicket(pizzaCarnesFrias)
                + "\n Precio: " + pizzaCarnesFrias.getPrecio());
        System.out.println("4. Pizza Italiana" + "\n Descripción: " + pizzaItaliana.getTicket(pizzaItaliana)
                + "\n Precio: " + pizzaItaliana.getPrecio());
        System.out.println("5. Pizza Especial" + "\n Descripción: " + pizzaEspecial.getTicket(pizzaEspecial)
                + "\n Precio: " + pizzaEspecial.getPrecio());
        int pizzaEleccion = scanner.nextInt();
        switch (pizzaEleccion) {
            case 1:
                PizzaAdapter pizzaAdapter = new PizzaAdapter(sabrosa);
                System.out.println("\n --- Pizza Sabrosa ---");
                imprimirTicket(pizzaAdapter);
                break;
            case 2:
                PizzaAdapter pizzaAdapterhawaiana = new PizzaAdapter(hawaiana);
                System.out.println("\n --- Pizza Hawaiana ---");
                imprimirTicket(pizzaAdapterhawaiana);
                break;
            case 3:
                PizzaAdapter pizzaAdapterCarnes = new PizzaAdapter(pizzaCarnesFrias);
                System.out.println("\n --- Pizza Carnes Frias ---");
                imprimirTicket(pizzaAdapterCarnes);
                break;
            case 4:
                PizzaAdapter pizzaAdapterItaliana = new PizzaAdapter(pizzaItaliana);
                System.out.println("\n --- Pizza Italiana ---");
                imprimirTicket(pizzaAdapterItaliana);
                break;
            case 5:
                PizzaAdapter pizzaAdapterEsp = new PizzaAdapter(pizzaEspecial);
                System.out.println("\n --- Pizza Especial ---");
                imprimirTicket(pizzaAdapterEsp);
                break;

            default:
                System.out.println("No se ha seleccionado ningúna pizza");
        }
    }

    /**
     * Metodo imprimirTicket que recibe una objeto de Tipo Baguette, pero que puede
     * ser tanto una baguette como una pizza, obtiene su descripcion y su precio y
     * nos devuelve el ticket de la comida ordenada.
     * 
     * @param comida la comida del usuario.
     */
    public void imprimirTicket(Baguette comida) {
        System.out.println("\nTu orden:");
        System.out.println(comida.getDescripcion());
        System.out.println("Precio: $" + comida.getPrecio());

    }
}