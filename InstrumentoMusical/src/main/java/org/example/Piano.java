package org.example;

public class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando una melodía en el piano.");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando las cuerdas internas del piano.");
    }
}