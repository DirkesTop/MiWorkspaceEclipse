package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo07 {
	public static void main(String[] args) {
		String texto = "0123 aadd_   d1?	f"; 
		String regex = "\\s"; // Comprueba si tiene espacios en blanco, saltos y tabuladores con el patrón "\s"

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res = texto.matches(".*\\s.*");
		System.out.println("Coincide? " + res);
	}
}
