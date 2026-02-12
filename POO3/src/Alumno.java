
public class Alumno {
	private int id;
	private String nombre;
	private String apellidos;
	private String dni;
	private String email;
	private String calle;
	private String direccion;
	private String telefono;
	
	public Alumno(int id, String nombre, String apellidos, String dni, String email, String calle, String direccion,
			String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.calle = calle;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String toString() {
		return nombre + " " + apellidos + " - " + dni;
	}
	
	
}
