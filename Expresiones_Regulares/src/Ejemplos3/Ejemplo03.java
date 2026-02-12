package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo03 {

	public static void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd"; 
		String regex = "^aa"; // Comprueba si la cadena empieza por "aa"

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res = texto.matches("^aa.*"); // Comprobar que contenga "aa" al principio 
		System.out.println("Coincide? " + res);
	}

}
