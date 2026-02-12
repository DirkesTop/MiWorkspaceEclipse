package Classes;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int n = pedirAlumnos("Introduzca el número de alumnos: ");
		Alumno[] alumnos = new Alumno[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nAlumno " + (i + 1));

			System.out.println("Nombre: ");
			String nombre = teclado.nextLine();

			System.out.println("Apellidos: ");
			String apellidos = teclado.nextLine();

			System.out.println("Edad: ");
			int edad = Integer.parseInt(teclado.nextLine());

			alumnos[i] = new Alumno(nombre, apellidos, edad);
		}
	}

	public static int pedirAlumnos(String enunciado) {
		System.out.println(enunciado);
		int alumnos = Integer.parseInt(teclado.nextLine().trim());
		return alumnos;
	}
	
	
}
