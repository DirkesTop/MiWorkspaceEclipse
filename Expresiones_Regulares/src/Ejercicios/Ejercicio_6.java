package Ejercicios;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio_6 {

	public static void main(String[] args) {
		String texto = " 0123 aadd_   d6?f";
		String regex = "\\d";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		System.out.println(m.find());
		System.out.println(m.start());

		
	}

}
