package com.juego.patrones.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtaqueBolaDeFuegoTest {

    @Test
    void danoDebeEstarEnRango() {

        AtaqueBolaDeFuego ataque =
                new AtaqueBolaDeFuego();

        int dano =
                ataque.calcularDano();

        assertTrue(
                dano >= 20 && dano <= 35);
    }
}