package clase;

import java.util.ArrayList;

/**
 * Clase principal que representa una clase de programación de nivel DAW1.
 */
public class Daw1 {
    public static ArrayList<IntegrantesClase> clase;

    public static void main(String[] args) {
        clase = new ArrayList<>();

        clase.add(new Profesor("51230681B", "Lucas", 33, 2500, 1, false));
        clase.add(new Alumno("53456681B", "Aaron", 24, "Carlos", 2000));
        clase.add(new Alumno("51267081B", "Valeria", 14, "Francisco", 2010));

        clase.add(new Profesor("41256061B", "Miguel", 67, 4000, 3, true));
        clase.add(new Alumno("57898681B", "Julian", 24, "Fernando", 2000));
        clase.add(new Alumno("34789681B", "Sebastian", 16, "Paco", 2008));

        pasarLista();
        System.out.println("----------");
        esMayorEdad();
        System.out.println("----------");
        System.out.println("La nota media de la clase es: " + notaMedia());


    }

    /**
     * Método para pasar lista, imprimiendo los alumnos presentes.
     */
    public static void pasarLista() {
        for (IntegrantesClase integrantes : clase) {
            if (integrantes instanceof Alumno) {
                System.out.println(integrantes);
            }
        }
    }

    /**
     * Método para comprobar si los alumnos son mayores o menores de edad.
     */
    public static void esMayorEdad() {
        for (IntegrantesClase integrantes : clase) {
            if (integrantes instanceof Alumno) {
                ((Alumno) integrantes).esMenorEdad();
            }
        }
    }

    /**
     * Método para calcular la nota media de la clase.
     *
     * @return La nota media de los alumnos en la clase.
     */
    public static double notaMedia() {
        double suma = 0;
        int contador = 0;
        for (IntegrantesClase integrante : clase) {
            if (integrante instanceof Alumno) {
                suma += ((Alumno) integrante).calcularNotaMedia();
                contador++;
            }
        }
        return suma / contador;
    }
}
