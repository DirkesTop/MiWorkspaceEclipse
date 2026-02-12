import java.util.Scanner;

import Classes.Config;
import Classes.Maze;
import Classes.Session;  


public class Main {
	private static final Scanner keyboard = new Scanner(System.in);
	private static Session session = new Session();
	private static Maze maze = new Maze();

	public static void main(String[] args) {

		System.out.println(Config.WELCOME);

		while (true) {
			// Menu sin sesion iniciada
			if (!session.isLogged()) {
				System.out.print(Config.UNLOGGED_MENU);
				String option = keyboard.nextLine();

				switch (option) {
				case "1":
					session.login();
					break;
				case "2":
					session.signup(keyboard);
					break;
				case "0":
					System.out.println(Config.GOODBYE);
					System.exit(0);
				default:
					System.out.println("Opción no válida.");
				}

			} else {
				// Menu con sesion iniciada
				System.out.print(Config.LOGGED_MENU);
				String option = keyboard.nextLine();

				switch (option) {
				case "1":
					maze.loadMaze();
					break;
				case "2":
					maze.showMaze();
					break;
				case "3":
					maze.setStartEnd();
					break;
				case "4":
					System.out.println("Próximamente");
					break;
				case "5":
					session.showUser();
					break;
				case "6":
					session.logout();
					maze.clear();
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