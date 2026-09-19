package org.example;

public class Bateria implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Marcando el ritmo en la batería.");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando la tensión de los parches de la batería.");
    }
}