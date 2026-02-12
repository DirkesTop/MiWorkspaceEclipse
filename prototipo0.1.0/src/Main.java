import java.util.Scanner;

public class Main {
	private static final Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println(Config.WELCOME);
		int opcion;
		System.out.println(Config.UNLOGGED_MENU);
		opcion = Integer.parseInt(keyboard.nextLine().trim());
		
		switch(opcion) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 0:
			System.out.println(Config.GOODBYE);
			break;
		}
	}
}
