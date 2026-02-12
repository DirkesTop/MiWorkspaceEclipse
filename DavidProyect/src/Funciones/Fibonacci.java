package Funciones;
import java.util.Scanner;

public class Fibonacci {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num = pedirEntero("Introduzca un número: ");
		
	}
	public static int pedirEntero(String enunciado) {
		System.out.println(enunciado);
		int numero = Integer.parseInt(teclado.nextLine().trim());
		return numero;
	}
}
