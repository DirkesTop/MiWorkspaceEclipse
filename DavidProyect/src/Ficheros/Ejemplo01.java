package Ficheros;
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; 
public class Ejemplo01 {

	public static void main(String[] args) {
		File fichero = new File("./assets/texto.txt");

	    try {
	    	Scanner lector = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String linea = myReader.nextLine();
	        System.out.println(linea);
	      }
	      lector.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Ha ocurrido un error.");
	      e.printStackTrace();
	    }
	}
}
