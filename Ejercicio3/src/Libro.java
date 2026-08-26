public class Libro {
    // declaracion atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getter & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion() {
        this.anioPublicacion = anioPublicacion;
    }

    // metodo mostrar datos
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo + " / Autor: " + autor + " / Año: " + anioPublicacion);
    }
}
