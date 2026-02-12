package objetos;

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		if (radio <= 0) {
			System.out.println("ERROR: El radio no es suficiente para crear un círculo");
		}
		this.radio = radio;
	} 
	public double generarArea() {
		return 3.14*radio;
	}
	
	public double generarPerimetro() {
		return 2*3.14*radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio() {
		if (radio < 0) {
			System.out.println("ERROR: El radio no es suficiente para crear un círculo");
		}
	}
}
