import java.util.Scanner;

public class WaySub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvendio a WaySub :D");
        System.out.println("Ofrecemos nuestras famosas Baguette y las tradicionales pizzas de Don Cangrejo");
        System.out.println("¿Qué te gustaria? 1. Baguette 🥖 2. Pizza 🍕 3. Nada lol");
        int opcion = scanner.nextInt();

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

        }// elige pan
    }

}