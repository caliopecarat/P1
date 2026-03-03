import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los lados del triángulo:");
        System.out.print("Lado 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double side3 = scanner.nextDouble();

        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el color del triángulo: ");
        String color = scanner.nextLine();

        System.out.print("¿El triángulo está relleno? (true/false): ");
        boolean isFilled = scanner.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(isFilled);

            System.out.println("\n--- Resultados ---");
            System.out.println("Área: " + triangle.getArea());
            System.out.println("Perímetro: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Relleno: " + triangle.isFilled());
            System.out.println(triangle.toString());

        } catch (IllegalTriangleException e) {
            System.out.println("\nError al crear el triángulo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}