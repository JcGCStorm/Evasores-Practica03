import java.util.Scanner;

public class Prepara {
    Scanner scanner = new Scanner(System.in);
    int[] ingredientesContador = new int[11];

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
                System.out.println("1. Pollo ($40.00)");
                System.out.println("2. Carne ($40.00)");
                System.out.println("3. Pepperoni ($10.00)");
                System.out.println("4. Jamon ($10.00)");
                System.out.println("5. Jiitomate ($5.05)");
                System.out.println("6. Cebolla ($5.05)");
                System.out.println("7. Lechuga ($5.05)");
                System.out.println("8. Mostaza ($2.00)");
                System.out.println("9. Mayonesa ($2.00)");
                System.out.println("10. Catsup ($2.00)");
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
                            int totalCarne = ingredientesContador[ingredienteEleccion] + cantidad;
                            if (totalCarne <= 3) {
                                for (int i = 0; i < cantidad; i++) {
                                    baguette = agregarIngrediente(ingredienteEleccion, baguette);
                                    ingredientesContador[ingredienteEleccion]++;
                                }
                                System.out.println("Se ha agregado Carne a tu orden.");
                            } else {
                                System.out.println("Ya has alcanzado el límite de carnita :(");
                            }
                            break;
                        case 3:
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
                        case 4:
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
                        case 5:
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
                        case 6:
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
                        case 7:
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
                        case 8:
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
                        case 9:
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
                        case 10:
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
            System.out.println("\nTu orden:");
            System.out.println(baguette.getDescripcion());
            System.out.println("Precio: $" + baguette.getPrecio());
        }
    }

    private Baguette agregarIngrediente(int tipoIngrediente, Baguette baguette) {
        switch (tipoIngrediente) {
            case 1:
                return new Pollo(baguette);
            case 2:
                return new Carne(baguette);
            case 3:
                return new Pepperoni(baguette);
            case 4:
                return new Jamon(baguette);
            case 5:
                return new Jitomate(baguette);
            case 6:
                return new Cebolla(baguette);
            case 7:
                return new Lechuga(baguette);
            case 8:
                return new Mostaza(baguette);
            case 9:
                return new Mayonesa(baguette);
            case 10:
                return new Catsup(baguette);
            default:
                return baguette;
        }
    }

    public void preparaPizza() {
        PizzaSabrosa sabrosa = new PizzaSabrosa(null);
        Pizza2 pizza2 = new Pizza2(null);
        PizzaCarnesFrias pizzaCarnesFrias = new PizzaCarnesFrias(null);
        Pizza4 pizza4 = new Pizza4(null);
        Pizza5 pizza5 = new Pizza5(null);

        System.out.println("Selecciona tu Pizza:");
        System.out.println("1. " + sabrosa.getNombre() + "\n Descripción: " + sabrosa.getDescripcion()
                + "\n Precio: " + sabrosa.getPrecio());
        System.out.println("2. " + pizza2.getNombre() + "\n Descripción: " + pizza2.getDescripcion()
                + "\n Precio: " + pizza2.getPrecio());
        System.out.println("3. " + pizzaCarnesFrias.getNombre() + "\n Descripción: " +
                pizzaCarnesFrias.getDescripcion() + "\n Precio: " + pizzaCarnesFrias.getPrecio());
        System.out.println("4. " + pizza4.getNombre() + "\n Descripción: " + pizza4.getDescripcion()
                + "\n Precio: " + pizza4.getPrecio());
        System.out.println("5. " + pizza5.getNombre() + "\n Descripción: " + pizza5.getDescripcion()
                + "\n Precio: " + pizza5.getPrecio());
        int pizzaEleccion = scanner.nextInt();

        switch (pizzaEleccion) {
            case 1:
                System.out.println("\n ---" + sabrosa.getNombre() + "---");
                imprimirTicket(sabrosa);
                break;
            case 2:
                System.out.println("\n ---" + pizza2.getNombre() + "---");
                imprimirTicket(pizza2);
                break;
            case 3:
                System.out.println("\n ---" + pizzaCarnesFrias.getNombre() + "---");
                imprimirTicket(pizzaCarnesFrias);
                break;
            case 4:
                System.out.println("\n ---" + pizza4.getNombre() + "---");
                imprimirTicket(pizza4);
                break;
            case 5:
                System.out.println("\n ---" + pizza5.getNombre() + "---");
                imprimirTicket(pizza5);
                break;

            default:
                System.out.println("No se ha seleccionado ningúna pizza");
        }
    }

    public void imprimirTicket(Baguette comida) {
        System.out.println("\nTu orden:");
        System.out.println(comida.getDescripcion());
        System.out.println("Precio: $" + comida.getPrecio());

    }
}