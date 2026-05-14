package com.juego.patrones.decorator;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueSalto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerUpDecoratorTest {

    @Test
    void debeConservarNombre() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        HongoDecorator hongo =
                new HongoDecorator(mario);

        assertEquals(
                "Mario",
                hongo.getNombre());
    }
}