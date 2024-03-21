package clase;

import java.util.ArrayList;

public class Daw1 {
	public static ArrayList<IntegrantesClase> clase;

	public static void main(String[] args) {
		clase = new ArrayList<>();

		clase.add(new Profesor("51230681B", "Lucas", 0, 0, 0, false));
		clase.add(new Alumno("53456681B", "Aaron", 24, null, 2000));
		clase.add(new Alumno("51267081B", "Valeria", 14, null, 2010));

		clase.add(new Profesor("41256061B", "Miguel", 0, 0, 0, false));
		clase.add(new Alumno("57898681B", "Julian", 24, null, 2000));
		clase.add(new Alumno("34789681B", "Sebastian", 16, null, 2008));

		pasarLista();
		System.out.println("----------");
		esMayorEdad();
		System.out.println("----------");
		System.out.println("La nota media de la clase es: " + notaMedia());
		
		

		
		
		

	}

	public static void pasarLista() {
		for (IntegrantesClase integrantes : clase) {
			if (integrantes instanceof Alumno) {
				System.out.println(integrantes);

			}

		}

	}

	public static void esMayorEdad() {
		for (IntegrantesClase integrantes : clase) {
			if (integrantes instanceof Alumno) {
				((Alumno) integrantes).esMenorEdad();

			}

		}

	}
	
	public static double notaMedia() {
		double notaMedia = 0;
		for (IntegrantesClase alumnos : clase) {
			if (alumnos instanceof Alumno) {
				notaMedia = ((Alumno) alumnos).calcularNotaMedia();
				
			}
			
		}
		
		return notaMedia;
		
		
		
		
		
		
		
		
	}
	
	


}
