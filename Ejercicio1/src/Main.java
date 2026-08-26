import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        int suma = num1 + num2 + num3;
        int resta = num1 - num2 - num3;

        double promedio = suma / 3.0;


        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {mayor = num3;
        }


        System.out.println("\nLos numeros ingresados son");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numero 3: " + num3);

        System.out.println("\nLa suma es: " + suma);

        System.out.println("\nLa resta es: " + resta);


        System.out.println("\nEl promedio es: " + promedio);


        System.out.println("\nEl número mayor es: " + mayor);

    }
}