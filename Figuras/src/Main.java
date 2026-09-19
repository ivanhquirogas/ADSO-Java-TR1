import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" FIGURAS GEOMÉTRICAS \n");

        double radio = pedirNumeroValido(scanner, "Ingrese el radio del Círculo: ");
        double baseRect = pedirNumeroValido(scanner, "Ingrese la base del Rectángulo: ");
        double alturaRect = pedirNumeroValido(scanner, "Ingrese la altura del Rectángulo: ");
        double baseTri = pedirNumeroValido(scanner, "Ingrese la base del Triángulo: ");
        double alturaTri = pedirNumeroValido(scanner, "Ingrese la altura del Triángulo: ");

        Figura[] figuras = {
                new Circulo(radio),
                new Rectangulo(baseRect, alturaRect),
                new Triangulo(baseTri, alturaTri)      // Guarda las figuras en un arreglo de tipo Figura[]
        };

        System.out.println("-----");
        System.out.println("FIGURAS (POLIMORFISMO)");

        Figura figuraMayor = figuras[0];

        for (Figura f : figuras) {
            f.dibujar();
            System.out.printf("Área: %.2f | Perímetro: %.2f\n", f.area(), f.perimetro());    // REQUISITO: Recorrido con for-each
            System.out.println("-----");

            if (f.area() > figuraMayor.area()) {
                figuraMayor = f;                    // Comparamos para encontrar la figura con mayor área
            }
        }

        System.out.printf("La figura con mayor área es el %s con un área de %.2f\n",
                figuraMayor.getClass().getSimpleName(), figuraMayor.area());        // Mostramos cual fue la figura mayor

        scanner.close();
    }

    private static double pedirNumeroValido(Scanner scanner, String mensaje) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {           // REQUISITO: Funcion para pedir numeros de forma segura con Try/Catch
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();

                if (numero <= 0) {
                    System.out.println(">> Error: El número debe ser positivo y mayor a 0. Intenta de nuevo.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(">> Error: Debes ingresar un número válido (ej. 5 o 4.5). Intenta de nuevo.");
                scanner.nextLine(); // Limpia el buffer del teclado
            }
        }
        return numero;
    }
}