package com.juego.patrones.strategy;

import java.util.Random;

public class AtaqueSalto implements EstrategiaAtaque {

    private final Random random = new Random();

    @Override
    public int calcularDano() {
        return random.nextInt(11) + 10;
    }
}