import java.util.Scanner;

/**
 * Clase WaySub, es nuestro main, la interacción entre el usuario y
 * el programa, debe dejar escoger entre pizza o Baguette, de ser
 * Baguette te muestra los ingredientes y cuántos deseas ponerle,
 * en caso contrario te muestra las pizzas y te da a escoger una.
 */
public class WaySub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[33m╔══════════════════════════╗");
        System.out.println("║       Bienvenido a       ║");
        System.out.println("║        \u001B[32mWaySub \u001B[33m          ║");
        System.out.println("╚══════════════════════════╝\u001B[0m");
        System.out.println("Ofrecemos nuestras famosas Baguette y las tradicionales pizzas de Don Cangrejo");
        System.out.println("¿Qué te gustaria? 1. Baguette 🥖 2. Pizza 🍕 3. Nada lol");
        int opcion = scanner.nextInt();

        /**
         * Switch con las opciones posibles del menu, crea un objeto de la Clase Prepara
         * y manda a llamar al metodo especifico que nos ayuda a escoger cada alimento.
         */
        switch (opcion) {
            case 1:
                Prepara preparab = new Prepara();
                preparab.preparaBaguette();
                break;
            case 2:
                Prepara preparap = new Prepara();
                preparap.preparaPizza();
                break;
            case 3:
                System.out.println("Gracias por visitarnos!! Ojalá no vuelvas");
                break;
            default:
                System.out.println("No seleccionaste una opción válida ):");

        }

    }
}