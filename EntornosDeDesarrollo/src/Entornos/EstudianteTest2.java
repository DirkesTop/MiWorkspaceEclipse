package Entornos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class EstudianteTest2 {

    // Tres estudiantes distintos
    private Estudiante e1;
    private Estudiante e2;
    private Estudiante e3;

    // Se ejecuta ANTES de cada test
    @BeforeEach
    public void crearEstudiantes() {
        e3 = new Estudiante("Marta", 19, 3.0); // Suspenso
        e1 = new Estudiante("Ana", 20, 9.5);   // Sobresaliente
        e2 = new Estudiante("Luis", 22, 6.5);  // Aprobado
    }

    // Comprueba que la edad se devuelve correctamente
    @Test
    public void testGetEdad() {
        int edad1 = e1.getEdad();
        int edad2 = e2.getEdad();
        int edad3 = e3.getEdad();

        assertEquals(20, edad1);
        assertEquals(22, edad2);
        assertEquals(19, edad3);
    }

    // Comprueba que el nombre se guarda correctamente
    @Test
    public void testGetNombre() {
        String n1 = e1.getNombre();
        String n2 = e2.getNombre();
        String n3 = e3.getNombre();

        assertEquals("Ana", n1);
        assertEquals("Luis", n2);
        assertEquals("Marta", n3);
    }

    // Comprueba el estado académico según la nota
    @Test
    public void testObtenerEstadoAcademico() {
        String estado1 = e1.obtenerEstadoAcademico();
        String estado2 = e2.obtenerEstadoAcademico();
        String estado3 = e3.obtenerEstadoAcademico();

        assertEquals("Sobresaliente", estado1);
        assertEquals("Aprobado", estado2);
        assertEquals("Suspenso", estado3);
    }

    // Comprueba que la nota se guarda correctamente
    @Test
    public void testGetNota() {
        double nota1 = e1.getNota();
        double nota2 = e2.getNota();
        double nota3 = e3.getNota();

        assertEquals(9.5, nota1);
        assertEquals(6.5, nota2);
        assertEquals(3.0, nota3);
    }
}
