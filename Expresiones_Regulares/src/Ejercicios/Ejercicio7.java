package Ejercicios;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {

	public static void main(String[] args) {
		String texto = "0123 aadd_   d1?f";
		String regex = "\\s";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while (m.find()) {
			System.out.println(m.start());
		}
		
	}

}
