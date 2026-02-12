package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sesion {

    public static boolean login(String usuario, String password) {

        String ruta = "src/assets/usuarios.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split("#");

                if (campos[0].equals(usuario) && campos[1].equals(password)) {
                    return true; 
                }
            }

        } catch (IOException e) {
            return false;
        }
        return false;
    }
}
