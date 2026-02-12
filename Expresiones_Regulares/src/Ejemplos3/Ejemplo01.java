package Ejemplos3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo01 {

	public static void main(String[] args) {
		String texto = "012ab9c"; // Texto con números y letras
		String regex = "\\d"; // Cualquier número del 0 al 9. Equivale a poner [0-9]

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res1 = texto.matches("\\d"); // Un único carácter numérico
		System.out.println("Coincide? " + res1);
		
		boolean res2 = texto.matches(".*\\d.*"); // Contenga un carácter numérico precedido y seguido de cualquier carácter 0 o muchas veces
		System.out.println("Coincide? " + res2);
	}

}
