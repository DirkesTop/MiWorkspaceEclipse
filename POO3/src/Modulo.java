
public class Modulo {
	/* Definir 3 metodos
	 * 1 Metodo que lee los modulos y devuelve un arraylist de modulos
	 * 2 Metodo que lee los alumnos y devuelve un arraylist de alumnos
	 * 3 Metodo que lee el cruice de modulo y alumno y devuevle un arraylist del tipo que sea con los datos
	 */
	private int id;
	private String nombre;
	private int curso;
	private int horas;
	private String profesor;
	private ArrayList<Alumno> alumnos;
	
	public Modulo(int id, String nombre, int curso, int horas, String profesor) {
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.horas = horas;
		this.profesor = profesor;
		this.alumnos = new ArrayList<Alumno>();
	}
	
	public void addAlumno(Alumno alu) {
		this.alumnos.add(alu);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
}
