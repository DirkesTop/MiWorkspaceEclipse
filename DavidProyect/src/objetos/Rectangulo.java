package objetos;

public class Rectangulo {
	private double ancho;
	private double alto;
	
	public Rectangulo(double ancho, double alto) {
		if(ancho <= 0 || alto <= 0) {
			System.out.println("ERROR: Al ancho y alto deben ser mayoures a 0");
			
		}
		this.ancho = ancho;
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if(ancho>0) {
			this.ancho = ancho;
		}
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		if(alto>0) {
			this.alto = alto;
		}
	}
	public double getArea() {
		return ancho * alto;
	}
	public double getPerimetro() {
		return 2*(ancho+alto);
	}
	
}
