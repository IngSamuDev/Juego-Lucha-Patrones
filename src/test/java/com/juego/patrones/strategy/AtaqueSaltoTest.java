package com.juego.patrones.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtaqueSaltoTest {

    @Test
    void danoDebeEstarEnRango() {

        AtaqueSalto ataque =
                new AtaqueSalto();

        int dano =
                ataque.calcularDano();

        assertTrue(
                dano >= 10 && dano <= 20);
    }
}