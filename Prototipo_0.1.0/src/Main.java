import java.util.Scanner;
import Classes.Config;
import Classes.Input;
import Classes.Session;

public class Main {
	private static final Scanner keyboard = new Scanner(System.in);
	private static Session session = new Session(); // Objeto Session que controla el login, logout y el usuario

	public static void main(String[] args) {

		System.out.println(Config.WELCOME);  // Muestra el mensaje de bienvenida
		while (true) {
			if (!session.isLogged()) { // Si no hay sesión iniciada...
				System.out.print(Config.UNLOGGED_MENU);  // Muestra el menú sin sesión iniciada
				String option = keyboard.nextLine();

				switch (option) {
				case "1":
					session.login(keyboard); // Opción iniciar sesión
					break;
				case "2":
					session.signup(keyboard); // Opción registro
					break;
				case "0":
					System.out.println(Config.GOODBYE); // Opción para salir del programa
					System.exit(0);
				default:
					System.out.println("Opción no válida."); 
				}

			} else { // Si si hay sesión iniciada
				System.out.print(Config.LOGGED_MENU); // Muestra el menú con sesión iniciada
				String option = keyboard.nextLine();

				switch (option) {
				case "1":
				case "2":
				case "3":
				case "4":
					System.out.println("Próximamente");
					break;
				case "5":
					session.showUser();
					break;
				case "6":
					session.logout();
					break;
				case "0":
					System.out.println(Config.GOODBYE);
					System.exit(0);
				default:
					System.out.println("Opción no válida.");
				}
			}
		}
	}
}
