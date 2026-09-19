
import java.util.ArrayList;

public class Estudiante {
    private final String nombre;
    private final ArrayList<Double> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();     // se inicializa el nombre y la lista de notas vacía
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    // Método para agregar una nota a la lista del estudiante
    public void agregarNota(double nota) {
        this.notas.add(nota);
    }
}