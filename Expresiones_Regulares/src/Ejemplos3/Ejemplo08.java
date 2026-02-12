package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo08 {
	public static void main(String[] args) {
		String texto = " 0123*aadd_ + /d1?f"; 
		String regex = "\\W"; // tiene caracteres no alfabeticos "\W" Incluye todos los caracteres especiales

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res = texto.matches(".*\\W.*");
		System.out.println("Coincide? " + res);
	}
}
