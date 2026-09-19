
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class GestorNotas {

    private HashMap<String, ArrayList<Double>> registroEstudiantes;     // REQUISITO 1: HashMap asocia el nombre con su lista de notas

    public GestorNotas() {
        this.registroEstudiantes = new HashMap<>();
    }

    public void agregarNotaEstudiante(String nombre, double nota) {     // REQUISITO 2: Registrar o recuperar a un estudiante y añadirle notas

        String clave = nombre.trim().toLowerCase();     // nombre a minusculas para evitar duplicados

        if (!registroEstudiantes.containsKey(clave)) {
            registroEstudiantes.put(clave, new ArrayList<>());  // Estudiante no existe aún en el HashMap, lo creamos con una lista vacía
        }

        registroEstudiantes.get(clave).add(nota);
        System.out.println(">> Nota " + nota + " registrada correctamente para " + clave);  // Se ingresa la nota a la lista correspondiente
    }


    public double calcularPromedio(String nombre) throws ArithmeticException {

        if (!registroEstudiantes.containsKey(nombre)) {  // REQUISITO 3: Verificar con containsKey si el estudiante existe
            System.out.println(">> El estudiante '" + nombre + "' no se encuentra en el registro.");
            return -1;
        }

        ArrayList<Double> notas = registroEstudiantes.get(nombre);

        if (notas.isEmpty()) {
            throw new ArithmeticException("El estudiante '" + nombre + "' no tiene notas registradas.");    // REQUISITO 4: Si la lista de notas está vacía, lanzamos una excepción manejada por try/catch
        }

        // Recorrido y cálculo de la suma
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();
    }

    public void mostrarAprobadosYMejor() {      // REQUISITO 5: Listar estudiantes aprobados (promedio >= 3.0) y mostrar el más alto
        if (registroEstudiantes.isEmpty()) {
            System.out.println(">> No hay estudiantes registrados en el sistema.");
            return;
        }

        System.out.println("\n--- LISTA DE ESTUDIANTES APROBADOS (Promedio >= 3.0) ---");
        boolean hayAprobados = false;

        String mejorEstudiante = "";
        double promedioMasAlto = -1;

        for (Map.Entry<String, ArrayList<Double>> entrada : registroEstudiantes.entrySet()) {
            String estudiante = entrada.getKey();       // Se recorre el HashMap

            try {
                double promedio = calcularPromedio(estudiante);

                if (promedio >= 3.0) {
                    System.out.printf("- %s: Promedio = %.2f\n", estudiante, promedio);
                    hayAprobados = true;
                }

                if (promedio > promedioMasAlto) {
                    promedioMasAlto = promedio;     // Guardamos el estudiante con el promedio más alto
                    mejorEstudiante = estudiante;
                }
            } catch (ArithmeticException e) {
                System.out.println("- " + e.getMessage());
            }
        }

        if (!hayAprobados) {
            System.out.println("Ningún estudiante aprobó o no tienen notas válidas.");
        }

        if (!mejorEstudiante.isEmpty() && promedioMasAlto >= 0) {
            System.out.println("\n------------------------------------------------");
            System.out.printf(" ESTUDIANTE CON EL PROMEDIO MÁS ALTO: %s (%.2f)\n", mejorEstudiante, promedioMasAlto);
            System.out.println("------------------------------------------------");
        }
    }

    public boolean existeEstudiante(String nombre) {
        return registroEstudiantes.containsKey(nombre);
    }
}