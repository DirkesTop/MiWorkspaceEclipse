package objetos;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Crear rectángulo
        Rectangulo r = new Rectangulo(2, 3);

        System.out.println("Ancho: " + r.getAncho());      // 2
        System.out.println("Alto: " + r.getAlto());        // 3
        System.out.println("Área: " + r.getArea());        // 6
        System.out.println("Perímetro: " + r.getPerimetro()); // 10

        // Probar setters válidos
        r.setAncho(4);
        r.setAlto(5);

        System.out.println("\n--- Después de cambiar dimensiones ---");
        System.out.println("Ancho: " + r.getAncho());      // 4
        System.out.println("Alto: " + r.getAlto());        // 5
        System.out.println("Área: " + r.getArea());        // 20

        // Probar setters inválidos
        r.setAncho(-10);
        r.setAlto(0);

        System.out.println("\n--- Intento de poner valores inválidos ---");
        System.out.println("Ancho: " + r.getAncho());      // sigue 4
        System.out.println("Alto: " + r.getAlto());        // sigue 5
    }
}
