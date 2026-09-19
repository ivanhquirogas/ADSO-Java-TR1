// Recibe cualquier vehículo (tipo padre)
public class Viaje {
    public void iniciarViaje(
            Vehiculo vehiculo) {
        vehiculo.arrancar();
        vehiculo.detener();
        vehiculo.combustible();
    }
}