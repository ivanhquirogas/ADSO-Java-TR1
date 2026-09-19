// Carro HEREDA de ClaseAbstracta
public class Carro extends Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("El carro ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El carro se ha detenido.");
    }

    @Override
    public void combustible() {
        System.out.println("El carro usa gasolina o electricidad.");
    }
}