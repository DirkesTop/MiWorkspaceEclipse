package Simulacro1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca un texto: ");
		String textoInicial = teclado.nextLine().trim();

		String textoFinal = textoInicial.replaceAll("\\b\\w+(ar|er|ir)\\b", "(VERBO)");

		File directorio = new File("./frases/");
		if (!directorio.exists()) {
			directorio.mkdirs();
		}
		String nombreArchivo = System.currentTimeMillis() + ".txt";
		File archivoFinal = new File(directorio, nombreArchivo);

		try (FileWriter fw = new FileWriter(archivoFinal)) {
			fw.write(textoFinal);
			System.out.println("Archivo guardado con éxito en: " + archivoFinal.getPath());
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}

		System.out.println(textoFinal);

	}
}
