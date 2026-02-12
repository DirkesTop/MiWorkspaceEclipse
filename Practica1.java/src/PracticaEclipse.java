import java.util.Scanner;

public class PracticaEclipse {
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca un texto: ");
	String texto = teclado.nextLine();
	
	System.out.println("Dame un número entero: ");
	int num1 = Integer.parseInt(teclado.nextLine());
	System.out.println("Dame un segundo número entero: ");
	int num2 = Integer.parseInt(teclado.nextLine());
	System.out.println("Dame un tercer número entero");
	int num3 = Integer.parseInt(teclado.nextLine());
	
	System.out.println("Dame un numero con decimales: ");
	double numeroDecimal = teclado.nextDouble();
	
	num1 = Math.abs(num1);
	num2 = Math.abs(num2);
	num3 = Math.abs(num3);
	
	int resultadoMultiplicacion = (num2*num3)+num1;
	
	double redondeoArriba = Math.ceil(numeroDecimal) ;
	double redondeoAbajo = Math.floor(numeroDecimal);
	
	System.out.println(" Su texto es " + texto + " , y sus numeros enteros convertidos a su valor absoluto son: " + num1 + " , " + num2 + " , " + num3 + " y su primer número redondeado arriba es: " + redondeoArriba + " , y su segundo numero decimal redondeado hacia abajo es: " + redondeoAbajo);
	
	}
}