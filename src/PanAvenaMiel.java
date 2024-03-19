/**
 * Clase PanAvenaMiel que representa un tipo de pan de la baguette
 * Cuenta con una descripcion y un precio ya asignados. Implementa a la
 * interfaz Baguette.
 * 
 * @Implements Baguette
 */
public class PanAvenaMiel implements Baguette {

    /**
     * Metodo getDescripcion, que nos devuelve la descripción del
     * pan. Regresa una String con el tipo de pan que es. Sobreescribe al
     * metodo getDescripcion de la interfaz Baguette.
     * 
     * @return String que representa al pan.
     */
    @Override
    public String getDescripcion() {
        return "Pan hecho de avena con toques de miel";
    }

    /**
     * Metodo getPrecio que sobreescribe al metodo homonimo de Baguette
     * 
     * @returns un double que nos dice el precio del pan
     */
    @Override
    public double getPrecio() {
        return 21.5;
    }
}