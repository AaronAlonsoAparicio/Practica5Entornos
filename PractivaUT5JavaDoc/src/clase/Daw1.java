package clase;

import java.util.ArrayList;

public class Daw1 {
	public static ArrayList<IntegrantesClase> clase;

	public static void main(String[] args) {
		clase = new ArrayList<>();

		clase.add(new Profesor("51230681B", "Lucas", 0, 0, 0, false));
		clase.add(new Alumno("53456681B", "Aaron", 0, null, 0));
		clase.add(new Alumno("51267081B", "Valeria", 0, null, 0));

		clase.add(new Profesor("41256061B", "Miguel", 0, 0, 0, false));
		clase.add(new Alumno("57898681B", "Julian", 0, null, 0));
		clase.add(new Alumno("34789681B", "Sebastian", 0, null, 0));
		
		pasarLista();

	}

	public static void pasarLista() {
		for (IntegrantesClase integrantes : clase) {
			if (integrantes instanceof Alumno) {
				System.out.println(integrantes);

			}

		}

	}
	
	
	

}
