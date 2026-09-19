package org.example;

public class Main {
    public static void main(String[] args) {
        // Pasos 3 y Reto: Arreglo polimórfico de tipo InstrumentoMusical
        InstrumentoMusical[] instrumentos = {
                new Guitarra(),
                new Piano(),
                new Bateria() // Simplemente agregarlo aquí demuestra el polimorfismo
        };

        // Paso 4: Recorrer con un for-each y ejecutar los métodos
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            instrumento.tocar();
            System.out.println("-----------------------------------");
        }
    }
}