package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo10 {
	public static void main(String[] args) {
		String texto = "JavaWorld";
		String regex = "[0-9a-f]"; // Comprueba si la cadena contiene [0-9a-f]

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res = texto.matches(".*[0-9a-f].*");
		System.out.println("Coincide? " + res);
	}
}
