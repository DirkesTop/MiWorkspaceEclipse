package Classes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  

public class Maze {
	private char[][] map;
	private String filename;
	private boolean loaded;
	private int startI;
	private int startJ;
	private int endI;
	private int endJ;

	public Maze() {
		this.map = null;
		this.filename = "";
		this.loaded = false;
		this.startI = -1;
		this.startJ = -1;
		this.endI = -1;
		this.endJ = -1;
	}

	public void loadMaze() {
		File folder = new File("assets/files");

		// Verifica si existe la carpeta
		if (!folder.exists()) {
			System.out.println("No se encuentra la carpeta assets/files");
			return;
		}

		File[] files = folder.listFiles();
		File[] mazes = new File[100];
		int count = 0;

		// Busca archivos .txt
		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().endsWith(".txt")) {
				mazes[count] = files[i];
				count++;
			}
		}

		if (count == 0) {
			System.out.println("No hay laberintos en la carpeta");
			return;
		}

		// Muestra el menu
		System.out.println("\n--- SELECCIONAR LABERINTO ---");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + " - " + mazes[i].getName());
		}
		System.out.println("0 - Cancelar");

		int option = Input.getInt("\nSeleccione un laberinto: ", true);

		if (option == 0) {
			return;
		}

		if (option < 1 || option > count) {
			System.out.println("Opcion no valida");
			return;
		}

		// Carga el archivo seleccionado
		File selectedFile = mazes[option - 1];

		try {
			Scanner reader = new Scanner(selectedFile);

			// Cuenta filas y columnas
			int rows = 0;
			int cols = 0;

			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				rows++;
				if (line.length() > cols) {
					cols = line.length();
				}
			}
			reader.close();

			// Crea la matriz
			map = new char[rows][cols];

			// Lee el archivo de nuevo
			reader = new Scanner(selectedFile);
			int row = 0;

			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				for (int j = 0; j < cols; j++) {
					if (j < line.length()) {
						map[row][j] = line.charAt(j);
					} else {
						map[row][j] = ' ';
					}
				}
				row++;
			}
			reader.close();

			this.filename = selectedFile.getName();
			this.loaded = true;
			this.startI = -1;
			this.startJ = -1;
			this.endI = -1;
			this.endJ = -1;

			System.out.println("\nLaberinto cargado correctamente!");

		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo");
		}
	}

	public void showMaze() {
		// Verifica si hay un laberinto cargado
		if (!loaded) {
			System.out.println("\nNo hay ningun laberinto cargado");
			return;
		}

		int rows = map.length;
		int cols = map[0].length;

		System.out.println("\n--- LABERINTO: " + filename + " ---");

		// Numeros de columna
		System.out.print("  ");
		for (int j = 0; j < cols; j++) {
			System.out.print(j % 10);
		}
		System.out.println();

		// Muestra el laberinto
		for (int i = 0; i < rows; i++) {
			System.out.print(i + " ");

			for (int j = 0; j < cols; j++) {
				// Muestra I si es inicio
				if (startI != -1 && i == startI && j == startJ) {
					System.out.print('I');
					// Muestra F si es fin
				} else if (endI != -1 && i == endI && j == endJ) {
					System.out.print('F');
				} else {
					System.out.print(map[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void setStartEnd() {
		// Verifica si hay un laberinto cargado
		if (!loaded) {
			System.out.println("\nNo hay ningun laberinto cargado");
			return;
		}

		int rows = map.length;
		int cols = map[0].length;

		System.out.println("\n--- ESTABLECER CASILLAS DE INICIO Y FIN ---");

		// Pide el inicio
		boolean startOk = false;
		while (!startOk) {
			System.out.println("\nCasilla de INICIO:");
			int i = Input.getInt("Introduce fila: ", true);
			int j = Input.getInt("Introduce columna: ", true);

			// Valida que es una posicion válida
			if (i >= 0 && i < rows && j >= 0 && j < cols && map[i][j] == ' ') {
				this.startI = i;
				this.startJ = j;
				startOk = true;
				System.out.println("Casilla de inicio guardada");
			} else {
				System.out.println("Coordenadas invalidas");
			}
		}

		// Pide el final
		boolean endOk = false;
		while (!endOk) {
			System.out.println("\nCasilla de FIN:");
			int i = Input.getInt("Introduce fila: ", true);
			int j = Input.getInt("Introduce columna: ", true);

			// Valida que es una posicion válida...
			if (i >= 0 && i < rows && j >= 0 && j < cols && map[i][j] == ' ') {
				// Valida que no es la misma que la de inicio
				if (i == startI && j == startJ) {
					System.out.println("No puede ser la misma que el inicio");
				} else {
					this.endI = i;
					this.endJ = j;
					endOk = true;
					System.out.println("Casilla de fin guardada");
				}
			} else {
				System.out.println("Coordenadas invalidas");
			}
		}

		System.out.println("\nCasillas establecidas correctamente!");
	}

	public void clear() {
		this.map = null;
		this.filename = "";
		this.loaded = false;
		this.startI = -1;
		this.startJ = -1;
		this.endI = -1;
		this.endJ = -1;
	}
}