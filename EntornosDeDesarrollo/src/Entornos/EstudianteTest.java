package Entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

	private Estudiante e1;
    private Estudiante e2;
    private Estudiante e3;

    @BeforeEach
    public void crearEstudiantes() {
        e1 = new Estudiante("Ana", 20, 9.5);   
        e2 = new Estudiante("Luis", 22, 6.5);  
        e3 = new Estudiante("Marta", 19, 3.0); 
    }
    
    @Test
    public void testGetNombre() {
        assertEquals("Ana", e1.getNombre());
        assertEquals("Luis", e2.getNombre());
        assertEquals("Marta", e3.getNombre());
    }

    @Test
    public void testGetEdad() {
        assertEquals(20, e1.getEdad());
        assertEquals(22, e2.getEdad());
        assertEquals(19, e3.getEdad());
    }
    @Test
    public void testGetNota() {
        assertEquals(9.5, e1.getNota());
        assertEquals(6.5, e2.getNota());
        assertEquals(3.0, e3.getNota());
    }
    @Test
    public void testObtenerEstadoAcademico() {
        assertEquals("Sobresaliente", e1.obtenerEstadoAcademico());
        assertEquals("Aprobado", e2.obtenerEstadoAcademico());
        assertEquals("Suspenso", e3.obtenerEstadoAcademico());
    }
}
