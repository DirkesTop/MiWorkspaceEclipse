package Ficheros;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo03 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Pedir por teclado un texto y añadirlo al fichero
		
		System.out.println("Escriba la frase a añadir en el fichero: ");
		String texto = teclado.nextLine().trim();
		
		try {
			FileWriter myWriter = new FileWriter("./assets/texto.txt", true);
			myWriter.write("\n" + texto);
			myWriter.close(); // must close manually
			System.out.println("Fichero escrito exitosamente.");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}
	}
}