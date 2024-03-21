package clase;

import java.util.Objects;

/**
 * Clase abstracta que representa a los integrantes de una clase.
 */
public abstract class IntegrantesClase {
    protected final String dni;
    protected final String nombre;
    protected int edad;

    /**
     * Constructor de la clase IntegrantesClase.
     *
     * @param dni   El DNI del integrante.
     * @param nombre    El nombre del integrante.
     * @param edad  La edad del integrante.
     */
    public IntegrantesClase(String dni, String nombre, int edad) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;

        comprobarDni();

    }

    /**
     * Retorna el nombre del integrante.
     *
     * @return El nombre del integrante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna la edad del integrante.
     *
     * @return La edad del integrante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del integrante.
     *
     * @param edad La nueva edad del integrante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Retorna el DNI del integrante.
     *
     * @return El DNI del integrante.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Comprueba si dos integrantes son iguales basándose en su DNI.
     *
     * @param obj   El objeto a comparar.
     * @return true si los integrantes son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IntegrantesClase other = (IntegrantesClase) obj;
        return Objects.equals(dni, other.dni);
    }

    /**
     * Retorna una representación en cadena del integrante.
     *
     * @return Una cadena que representa al integrante.
     */
    @Override
    public String toString() {
        return "IntegrantesClase [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
    }

    /**
     * Método abstracto para imprimir la información del integrante.
     */
    public abstract void imprimirInformacion();

    /**
     * Método abstracto para comprobar la validez del DNI del integrante.
     *
     * @return true si el DNI es válido, false si no lo es.
     */
    public abstract boolean comprobarDni();

}
