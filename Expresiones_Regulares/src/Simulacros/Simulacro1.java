package Simulacros;

import java.util.Scanner;

public class Simulacro1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce un texto: ");
		String texto = teclado.nextLine().trim();
		
		System.out.println("Texto original: " + texto);
		
		String regex = "";
		
		System.out.println("Texto cambiado: " + texto);

	}
}
