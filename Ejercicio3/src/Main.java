import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro[] libros = new Libro[5]; // Arreglo guarda 5 libros

        // introducir libros
        System.out.println("+++++ Registro de 5 Libros +++++");
        for (int i = 0; i < libros.length; i++) {
            System.out.println("\n+++ Libro " + (i + 1) + " +++");
            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();


            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Año de publicacion: ");
            int anio = scanner.nextInt();
            scanner.nextLine();

            // se instancia el objeto y se guarda en la posicion i
            libros[i] = new Libro(titulo, autor, anio);
        }

        // mostrar informacion de todos los libros
        System.out.println("\n----- Catalogo de Libros -----");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }

        // Buscar libro
        System.out.println(("\n+++++ Busqueda de Libro +++++"));
        System.out.print("Ingrese el nombre de libro a buscar: ");
        String tituloBuscado = scanner.nextLine();

        boolean encontrtado = false;
        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                System.out.println("\n=== Libro encontrado ===");
                libro.mostrarInformacion();
                encontrtado = true;
                break; // se detiene la busqueda al encontrar
            }
        }
        if (!encontrtado) {
            System.out.println("No se encontro ningunlibro con el titulo.");
        }

        // Encontrar libro mas antiguo
        System.out.println("\n=== Libro mas antiguo ===");
        Libro masAntiguo = libros[0]; // se inicia con el primer libro considerandolo el mas viejo

        for (int i = 1; i < libros.length; i++) {
            if (libros[i].getAnioPublicacion() < masAntiguo.getAnioPublicacion()) {
                masAntiguo = libros[i]; // Actualizamos la referencia si encontramos uno menor
            }
        }

        masAntiguo.mostrarInformacion();

    }
}