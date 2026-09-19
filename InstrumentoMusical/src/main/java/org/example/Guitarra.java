package org.example;

public class Guitarra implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Sonando los acordes de la guitarra: ¡Suena genial!");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando las cuerdas de la guitarra.");
    }
}