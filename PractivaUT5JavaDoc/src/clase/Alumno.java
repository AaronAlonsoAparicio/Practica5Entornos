package clase;

/**
 * @author Aaron Clase que representa a un alumno en una clase.
 */
public class Alumno extends IntegrantesClase {
	private final int numeroAsignaturas = 4; // Número fijo de asignaturas para un alumno
	private String nombrePadre;
	private int anyoNacimiento;

	/**
	 * Constructor de la clase Alumno.
	 * 
	 * @param dni               El DNI del alumno.
	 * @param nombre            El nombre del alumno.
	 * @param edad              La edad del alumno.
	 * @param numeroAsignaturas El número de asignaturas del alumno.
	 * @param nombrePadre       El nombre del padre del alumno
	 * @param anyoNacimiento    El año en el que nacio el alumno
	 */

	public Alumno(String dni, String nombre, int edad, String nombrePadre, int anyoNacimiento) {
		super(dni, nombre, edad);
		this.nombrePadre = nombrePadre;
		this.anyoNacimiento = anyoNacimiento;
	}

	/**
	 * Retorna el nombre del padre.
	 *
	 * @return El nombre del padre.
	 */
	public String getNombrePadre() {
		return nombrePadre;
	}

	/**
	 * Retorna el año de nacimiento.
	 *
	 * @return El año de nacimiento.
	 */
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	/**
	 * Método toString para mostrar las caracteristicas de cada usuario.
	 * 
	 * @return Representación en cadena del objeto Alumno.
	 */
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", notaMediaCurso="
				+ ", numeroAsignaturas=" + numeroAsignaturas + "]";
	}

	/**
	 * Método para imprimir la información del alumno.
	 */
	@Override
	public void imprimirInformacion() {
		System.out.println(toString());
	}

	/**
	 * Método para obtener el número de asignaturas del alumno.
	 * 
	 * @return El número de asignaturas del alumno.
	 */
	public int getNumeroAsignaturas() {
		return numeroAsignaturas;
	}

	/**
	 * 
	 * @param suma
	 * @return double la nota media de cada alumno.
	 */

	public double calcularNotaMedia() {
		double suma;
		suma = notasAsigatura.NOTA_BASE_DE_DATOS + notasAsigatura.NOTA_LENGUAJE_DE_MARCAS
				+ notasAsigatura.NOTA_PROGRAMACION + notasAsigatura.NOTA_SISTEMAS;

		double notaMedia = suma / this.numeroAsignaturas;
		return notaMedia;
	}

	/**
	 * Método para comprobar la validez de un DNI.
	 * 
	 * @return true si el DNI es válido, false si no lo es.
	 */

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
	 * Determina si la persona es menor de edad basándose en su año de nacimiento.
	 *
	 * @return true si la persona es menor de edad, false si es mayor de edad.
	 */
	public boolean esMenorEdad() {
		if (this.anyoNacimiento < 2006) {
			System.out.println("Es mayor de edad");
			return false;
		} else {
			System.out.println("Es menor de edad");
			return true;
		}
	}

}
