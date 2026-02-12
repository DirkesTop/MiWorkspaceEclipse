import java.io.File;                 
import java.io.FileNotFoundException; 
import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Coordenada> coords = importarCoordenadas();
		
		Coordenada coordenada1 = new coordenada(3, 5);
		
		try (Scanner myReader = new Scanner(Main.class.getResourceAsStream("/coordenadas.txt"))) {
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	public static ArrayList<Coordenada> importarCoordenadas() {
		
	}
}
