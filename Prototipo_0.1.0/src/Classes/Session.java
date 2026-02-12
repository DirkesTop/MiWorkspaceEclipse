package Classes;
import java.io.*;
import java.util.Scanner;

public class Session {

	private User user; //Aquí se guardará el usuario que ha iniciado sesión
	private boolean logged; 	// Indica si hay una sesión iniciada o no
							    // true indica que hay sesión
							    // false indica que no hay sesión

	private static final String FILE_PATH = "assets/files/";   // Ruta donde se encuentra el archivo de usuarios
	private static final String USERS_FILE = "users.txt";	   // Nombre del archivo donde se guardan los usuarios

	public Session() {	 // Constructor de la clase Session
		logged = false;  // Al iniciar el programa no hay ningún usuario logueado
	}

	public boolean isLogged() {  // Método que devuelve si hay sesión iniciada o no
		return this.logged;
	}

	public void login(Scanner keyboard) { 		// Método para iniciar sesión
		System.out.print("Usuario: ");    		// Pide el nombre de usuario
		String username = keyboard.nextLine();
		if (username .length() == 0) {
			System.out.println("El nombre de usuario está vacío");
			return;
		}

		System.out.print("Contraseña: ");		// Pide la contraseña
		String password = keyboard.nextLine();
		if (password .length() == 0) {
			System.out.println("La contraseña está vacía");
			return;
		}

		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH + USERS_FILE))) { // Abre el archivo de usuarios para leerlo

			String line; 
			// Lee el archivo línea por línea
			while ((line = br.readLine()) != null) { 

				String[] data = line.split("#");

				if (data[0].equalsIgnoreCase(username) && data[1].equals(password)) {
					user = new User(data[0], data[2], data[3], data[4], data[5], data[6], "USER");
					logged = true;
					System.out.println("Sesión iniciada correctamente.");
					return;
				}
			}

			System.out.println("Usuario o contraseña incorrectos.");

		} catch (IOException e) {
			System.out.println("Error al leer el fichero de usuarios.");
		}
	}

	public void signup(Scanner keyboard) { // Método para registrar un nuevo usuario

		System.out.print("Nombre de usuario: "); // Pide el nombre de usuario
		String username = keyboard.nextLine();

		if (userExists(username)) { 			// Comprueba si el usuario ya existe
			System.out.println("El usuario ya existe.");
			return;
		}

		System.out.print("Contraseña: "); 		// Pide el resto de datos
		String password = keyboard.nextLine();

		System.out.print("Nombre completo: ");
		String name = keyboard.nextLine();

		System.out.print("NIF: ");
		String nif = keyboard.nextLine();

		System.out.print("Email: ");
		String email = keyboard.nextLine();

		System.out.print("Dirección: ");
		String address = keyboard.nextLine();

		System.out.print("Fecha de nacimiento: ");
		String birthdate = keyboard.nextLine();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH + USERS_FILE, true))) {  // Abre el archivo en modo añadir (true)

			bw.write(  			// Escribe el usuario en una línea
					"\n" + username + "#" + password + "#" + name + "#" + nif + "#" + email + "#" + address + "#" + birthdate);
			bw.newLine(); 	    // Salto de línea para el siguiente usuario

			System.out.println("Usuario registrado correctamente.");

		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero.");
		}
	}

	private boolean userExists(String username) {   // Método que comprueba si un usuario ya existe
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH + USERS_FILE))) { // Abre el archivo para leer

			String line;
			while ((line = br.readLine()) != null) {  // Recorre todas las líneas
				if (line.split("#")[0].equals(username)) {
					return true;
				}
			}

		} catch (IOException e) {

		}
		return false;
	}

	public void showUser() { // Muestra por pantalla la información del usuario actual
		if (user != null) {
			System.out.println(user);
		}
	}

	public void logout() { // Cierra la sesión actual
		System.out.println("Cerrando sesión...");
		this.logged = false;
		this.user = null;
	}
}
