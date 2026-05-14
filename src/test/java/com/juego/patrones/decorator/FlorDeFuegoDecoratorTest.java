package com.juego.patrones.decorator;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueSalto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlorDeFuegoDecoratorTest {

    @Test
    void debeHacerDanoExtra() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        Personaje bowser =
                new Personaje(
                        "Bowser",
                        100,
                        new AtaqueSalto());

        FlorDeFuegoDecorator flor =
                new FlorDeFuegoDecorator(
                        mario);

        flor.atacar(bowser);

        assertTrue(
                bowser.getPuntosDeVida() <= 85);
    }
}