import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- INGRESO DE DATOS ---");

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese la cantidad comprada: ");
        int cantidadComprada = scanner.nextInt();

        Cliente cliente = new Cliente(nombreCliente);
        Producto producto = new Producto(nombreProducto, precioProducto);
        Venta venta = new Venta(cliente, producto, cantidadComprada);

        venta.mostrarDetalle();
    }
}