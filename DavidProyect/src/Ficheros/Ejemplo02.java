package Ficheros;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

public class Ejemplo02 {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("./assets/texto.txt", true);
			myWriter.write("\nEsto es una nueva línea");
			myWriter.close(); // must close manually
			System.out.println("Fichero escrito exitosamente.");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}
	}

}
