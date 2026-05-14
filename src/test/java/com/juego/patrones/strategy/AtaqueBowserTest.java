package com.juego.patrones.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtaqueBowserTest {

    @Test
    void danoDebeEstarEnRango() {

        AtaqueBowser ataque =
                new AtaqueBowser();

        int dano =
                ataque.calcularDano();

        assertTrue(
                dano >= 25 && dano <= 45);
    }
}