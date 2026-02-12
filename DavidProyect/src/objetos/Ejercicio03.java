package objetos;

import java.util.Scanner;

public class Ejercicio03 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Circulo c1 = new Circulo(5);
		Circulo c2 = new Circulo(3.4);
		
		System.out.println(c1.generarArea());
		System.out.println(c1.generarPerimetro());
		System.out.println(c2.generarArea());
		System.out.println(c2.generarPerimetro());
		
	}
}
