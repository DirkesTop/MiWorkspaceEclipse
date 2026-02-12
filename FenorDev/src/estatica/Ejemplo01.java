package estatica;

public class Ejemplo01 {

	public static void main(String[] args) {
		Alumno alu1 = new Alumno(1, "David", "Fenor", "23/11/1996", "david@gmail.com");
		Alumno alu2 = new Alumno(2, "Pepe", "Martinez", "23/11/1998", "pepe@gmail.com");
		
		System.out.println("Alumno 1: " + alu1.getEmail());
		System.out.println("Alumno 2: " + alu2.getEmail());
		
		double resultado = Math.pow(2, 8);
		System.out.println("2 elevado a 8 = " + resultado);

	}
}
