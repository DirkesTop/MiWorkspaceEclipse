package Ficheros;
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; 
public class Ejemplo04 {

	public static void main(String[] args) {
		ArrayList<Alumno> Lista = obtenerAlumnos();
		File fichero = new File("./assets/alumno.csv");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();

				String[] campos = linea.split(";");
				if (campos.length == 5) {
					int id = Integer.parseInt(campos[0]);
					Alumno alu = new Alumno(id, campos[1], campos[2], campos[3], campos[4]);
					
					listado.add(alu);
				}

			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}
	}

	public static ArrayList<Alumno> obtenerAlumnos() {
		ArrayList<Alumnos>
	}
}
