public class Bicicleta extends Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("La bicicleta empieza a rodar con pedaleo.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se detiene al accionar los frenos de mano.");
    }

    @Override
    public void combustible() {
        System.out.println("La bicicleta no usa combustible, funciona con fuerza humana.");
    }
}
