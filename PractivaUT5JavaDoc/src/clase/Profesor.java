package clase;

/**
 * Clase que representa a un profesor en una clase.
 */
public class Profesor extends IntegrantesClase {
    private double sueldo;
    private int numeroHijos;
    private boolean jefeDepartamento;

    /**
     * Constructor de la clase Profesor.
     *
     * @param dni               El DNI del profesor.
     * @param nombre            El nombre del profesor.
     * @param edad              La edad del profesor.
     * @param sueldo            El sueldo del profesor.
     * @param numeroHijos       El número de hijos del profesor.
     * @param jefeDepartamento  Indica si el profesor es jefe de departamento.
     */
    public Profesor(String dni, String nombre, int edad, double sueldo, int numeroHijos, boolean jefeDepartamento) {
        super(dni, nombre, edad);
        this.sueldo = sueldo;
        this.numeroHijos = numeroHijos;
        this.jefeDepartamento = jefeDepartamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public boolean isJefeDepartamento() {
        return jefeDepartamento;
    }

    public void setJefeDepartamento(boolean jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
    }

    /**
     * Retorna una representación en cadena del profesor.
     *
     * @return Una cadena que representa al profesor.
     */
    @Override
    public String toString() {
        return "Profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
    }

    /**
     * Método para imprimir la información del profesor.
     */
    @Override
    public void imprimirInformacion() {
        System.out.println(toString());
    }

    /**
     * Método para comprobar la validez del DNI del profesor.
     *
     * @return true si el DNI es válido, false si no lo es.
     */
    @Override
	public boolean comprobarDni() {
		// 51346081B
		int contador = 0;
		// Verificar los 8 primero digitos del DNI.
		while (contador < 8) {
			if (!Character.isDigit(this.dni.charAt(contador))) {
				System.out.println("Este DNI no es valido");
				return false;
			}
			contador++;

		}

		// Verificar el ultimo caracter.
		while (contador >= 9 && contador < 10) {
			if (!Character.isLetter(this.dni.charAt(contador))) {
				System.out.println("Este DNI no es valido");
				return false;

			} else {
				System.out.println("DNI valido.");

			}
			contador++;

		}

		return true;
	}

    /**
     * Determina si el profesor es jefe de departamento basándose en su sueldo.
     *
     * @return true si el profesor es jefe de departamento, false si no lo es.
     */
    public boolean esJefeDepartamento() {
        if (this.sueldo < 2000) {
            setJefeDepartamento(false);
            return false;
        } else {
            setJefeDepartamento(true);
            return true;
        }
    }
}
