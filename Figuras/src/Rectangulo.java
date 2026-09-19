public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;       // Constructor para inicializar base y altura
    }

    @Override
    public double area() {
        return base * altura;              // Fórmula del área del rectángulo
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);         // Fórmula del perímetro del rectángulo: 2 * (base + altura)
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Rectángulo de " + base + " x " + altura);  // Implementación del metodo dibujar
    }
}