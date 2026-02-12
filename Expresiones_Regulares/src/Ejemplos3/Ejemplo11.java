package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo11 {
	public static void main(String[] args) {
		String texto = "JavaWorld";
		String regex = "a[Ww]"; // Comprueba si la cadena contiene el grupo a seguida de una w o W

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res = texto.matches(".*a[Ww].*");
		System.out.println("Coincide? " + res);
	}
}
