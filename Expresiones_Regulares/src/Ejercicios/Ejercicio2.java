package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		/* Crea un programa que pida un nombre de usuario e indique si es válido de acuerdo al siguiente formato:

    - Debe tener una longitud de entre 3 y 20 caracteres
    - Debe empezar por un carácter alfabético, mayúscula o minúscula
    - A partir del segundo carácter puede contener mayúsculas, minúsculas, números, y caracteres especiales como _ # $ % ? = + -
 */
	
		System.out.println("Indique su nombre de usuario: ");
		String usuario = teclado.nextLine().trim();
		
	}
}
