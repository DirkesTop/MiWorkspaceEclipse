package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo06 {
	public static void main(String[] args) {
		String texto = "abc del mareo"; 
		String regex = "mar."; // Comprueba si la cadena contiene los tres caracteres indicados con el patrón "mar", seguido de cualquier carácter.

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res = texto.matches(".*mar..*"); 
		System.out.println("Coincide? " + res);
	}
}
