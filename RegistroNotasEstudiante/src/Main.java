
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorNotas gestor = new GestorNotas();
        boolean salir = false;


        System.out.println("  REGISTRO DE NOTAS DE ESTUDIANTES ");

        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar estudiante y/o añadir nota");
            System.out.println("2. Consultar promedio de un estudiante");
            System.out.println("3. Ver estudiantes aprobados y el promedio más alto");
            System.out.println("4. Salir");

            int opcion = pedirEnteroValido(scanner, "Seleccione una opción (1-4): ");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine().trim();

                    if (nombre.isEmpty()) {
                        System.out.println(">> Error: El nombre no puede estar vacío.");
                        break;
                    }

                    double nota = pedirNotaValida(scanner, "Ingrese la nota (entre 0.0 y 5.0): ");
                    gestor.agregarNotaEstudiante(nombre, nota);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del estudiante a consultar: ");
                    String consultaNombre = scanner.nextLine().trim();

                    if (gestor.existeEstudiante(consultaNombre)) {
                        try {
                            double promedio = gestor.calcularPromedio(consultaNombre);
                            System.out.printf(">> El promedio de %s es: %.2f\n", consultaNombre, promedio);
                        } catch (ArithmeticException e) {
                            System.out.println(">> " + e.getMessage());
                        }
                    } else {
                        System.out.println(">> El estudiante '" + consultaNombre + "' no existe en el sistema.");
                    }
                    break;

                case 3:

                    gestor.mostrarAprobadosYMejor();    // REQUISITO 5: Aprobados y Promedio mas alto
                    break;

                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println(">> Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    // Metodo auxiliar para validar la entrada de enteros por consola sin errores
    private static int pedirEnteroValido(Scanner scanner, String mensaje) {
        int numero = -1;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                scanner.nextLine(); // Limpiar el salto de línea
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println(">> Error: Debe ingresar un número entero válido.");
                scanner.nextLine();
            }
        }
        return numero;
    }

    // Metodo auxiliar para validar notas dentro del rango correcto
    private static double pedirNotaValida(Scanner scanner, String mensaje) {
        double nota = -1;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensaje);
                nota = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer

                if (nota < 0.0 || nota > 5.0) {
                    System.out.println(">> Error: La nota debe estar entre 0.0 y 5.0.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(">> Error: Debe ingresar un valor numérico (ejemplo: 4.5 o 3,8).");
                scanner.nextLine();
            }
        }
        return nota;
    }
}