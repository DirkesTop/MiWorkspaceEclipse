package Clases;

import static org.junit.Assert.*;
import org.junit.Test;

public class SesionTest {

    @Test
    public void loginCorrectoUsuario1() {
        assertTrue(Sesion.login("dmunuera", "123456"));
    }

    @Test
    public void loginCorrectoUsuario2() {
        assertTrue(Sesion.login("pepe", "654321"));
    }

    @Test
    public void loginUsuarioIncorrecto() {
        assertFalse(Sesion.login("juan", "123456"));
    }

    @Test
    public void loginPasswordIncorrecta() {
        assertFalse(Sesion.login("maria", "000000"));
    }
}
