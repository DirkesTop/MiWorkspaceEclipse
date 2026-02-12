package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo12 {
	public static void main(String[] args) {
		String texto = "pepe@gmail.com";
		String regex = "([^@])+"; // Comprueba si la cadena contiene uno o varios grupos formados por caracteres que no sean @

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		// Que SÍ contenga la @, que no sea al principio ni al final
		boolean res = texto.matches(".+[@].+");
		System.out.println("Coincide? " + res);
	}
}
