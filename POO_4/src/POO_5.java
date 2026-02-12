import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class POO_5 {
	public static void main(String[] args) {

		String nombreArchivo = "productos.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
			Producto p1 = new Producto("Coche", 22.223, 1);

			writer.write(p1.nombre + "," + p1.precio + "," + p1.cantidad);
			writer.newLine();
			
			System.out.println("Producto guardado con éxito.");

		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo: " + e.getMessage());
		}

		try {
			File fichero = new File("productos.txt"); // Create File object
			if (fichero.createNewFile()) { // Try to create the file
				System.out.println("File created: " + fichero.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace(); // Print error details
		}

		try {
			FileWriter fw = new FileWriter("productos.txt", true);
			fw.write("Files in Java might be tricky, but it is fun enough!");
			fw.close(); // must close manually
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		try (Scanner lector = new Scanner(new File("productos.txt"))) {
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] datos = linea.split(",");
				
				String nombre = datos[0];
				double precio = Double.parseDouble(datos[1]);
				int cantidad = Integer.parseInt(datos[2]);
				
				Producto p = new Producto(nombre, precio, cantidad);
				
				System.out.println("Leído del archivo: " + p);
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
