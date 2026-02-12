package FicherosPruebas;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class prueba1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		File archivo = new File("usuarios.txt");
		
		try {
			// PEDIR DATOS
			System.out.print("Nombre: ");
			String nombre = teclado.nextLine();
			
			System.out.print("Edad: ");
			String edad = teclado.nextLine();
			
			// GUARDAR DATOS
			FileWriter fw = new FileWriter(archivo, true);
			fw.write(nombre + " - " + edad + "\n");
			fw.close();
			
			// LEER ARCHIVO	
			Scanner lector = new Scanner(archivo);
			System.out.println("Contenido del archivo:");
			
			while (lector.hasNextLine()) {
				System.out.println(lector.nextLine());
			}
			lector.close();
		} catch (Exception e) {
			System.out.println("Error en el manejo del archivo");
		}
		teclado.close();
	}
}
