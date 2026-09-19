public class Main {

    public static void main(String[] args) {
        // Ejemplo de polimorfismo cambiando la referencia
        // 1. Crear el arreglo de vehículos (de tipo padre Vehiculo)
        Vehiculo[] listaVehiculos = new Vehiculo[3];

        listaVehiculos[0] = new Carro();
        listaVehiculos[1] = new Moto();
        listaVehiculos[2] = new Bicicleta();

        // 2. Recorrer el arreglo usando un bucle for-each
        System.out.println("=== DEMOSTRACIÓN DE POLIMORFISMO ===");

        for (Vehiculo v : listaVehiculos) {
            v.arrancar();
            v.combustible();
            v.detener();
            System.out.println("--------------------------------");
        }
    }
}