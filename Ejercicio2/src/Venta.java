public class Venta {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    //se aplica el 10% de descuento al tope que se aplique
    private static final double UMBRAL_DESCUENTO = 100000.0;

    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Calcula el subtotal
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    // Calcula el descuento (10% si el subtotal supera el umbral)
    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (subtotal > UMBRAL_DESCUENTO) {
            return subtotal * 0.10;
        }
        return 0.0;
    }

    // Calcula el total final
    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento();
    }

    // información en pantalla
    public void mostrarDetalle() {
        double subtotal = calcularSubtotal();
        double descuento = calcularDescuento();
        double total = calcularTotal();

        System.out.println("\n=================================");
        System.out.println("       RESUMEN DE LA VENTA       ");
        System.out.println("=================================");
        System.out.println("Cliente:          " + cliente.getNombre());
        System.out.println("Producto:         " + producto.getNombre());
        System.out.println("Precio unitario:  $" + producto.getPrecio());
        System.out.println("Cantidad:         " + cantidad);
        System.out.println("---------------------------------");
        System.out.println("Subtotal:         $" + subtotal);

        if (descuento > 0) {
            System.out.println("Descuento (10%): -$" + descuento);
        } else {
            System.out.println("Descuento:        $0.0 (No aplica)");
        }

        System.out.println("---------------------------------");
        System.out.println("TOTAL A PAGAR:    $" + total);
        System.out.println("=================================");
    }
}
