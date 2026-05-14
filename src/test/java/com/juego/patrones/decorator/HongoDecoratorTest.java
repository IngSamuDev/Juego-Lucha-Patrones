package com.juego.patrones.decorator;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueSalto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HongoDecoratorTest {

    @Test
    void debeAumentarVida() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        HongoDecorator hongo =
                new HongoDecorator(mario);

        assertEquals(
                150,
                hongo.getPuntosDeVida());
    }
}