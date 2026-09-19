public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;           // Constructor para inicializar base y altura
    }


    @Override
    public double area() {
        return (base * altura) / 2;     // Fórmula del área del triángulo: (base * altura) / 2
    }


    @Override
    public double perimetro() {
        double hipotenusa = Math.sqrt((base * base) + (altura * altura));
        return base + altura + hipotenusa;      // Fórmula del perímetro de un triángulo rectángulo
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triángulo de base " + base + " y altura " + altura);  // Implementación del metodo dibujar
    }
}