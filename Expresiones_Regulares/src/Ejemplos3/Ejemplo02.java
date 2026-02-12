package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo02 {

	public static void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd"; 
		String regex = "asd"; // Comprueba si la cadena contiene exactamente el patrón "asd"

		//Hacer búsquedas y extraer los fragmentos que coindicen
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		
		System.out.println("Concordancias: ");
		while(concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (Valor: " + concordancias.group() + ")");
		}
		
		// Comprobar si toda la cadena cumple con la expresión
		boolean res = texto.matches(".*asd.*"); // Comprobar que contenga "asd" 
		System.out.println("Coincide? " + res);
	}

}
