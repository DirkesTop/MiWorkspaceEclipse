package Ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Escribe un método que se llame invertirTexto() que recibe una cadena de caracteres cualquiera y la devuelve invertida. 
		 * Por ejemplo: "Introducción" -> "nóiccudortnI" 
		 * Prueba el método pedido desde main(). 
		 * Se recomienda utilizar internamente un StringBuilder y un bucle do-while */
		System.out.println(invertirTexto("Introduccion"));
		
	}
	public static String invertirTexto(String cadena) {
		
		StringBuffer s = new StringBuffer(cadena);
		s.reverse();
		String s1 = s.toString();
		return s1;
	}
}
