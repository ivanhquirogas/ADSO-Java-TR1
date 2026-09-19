public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;                  // Constructor para inicializar el radio
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;     // Fórmula del área del círculo: π * r²
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;         // Fórmula del perímetro del círculo: 2 * π * r
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Círculo con radio " + radio);  // Implementación del metodo dibujar
    }


}
