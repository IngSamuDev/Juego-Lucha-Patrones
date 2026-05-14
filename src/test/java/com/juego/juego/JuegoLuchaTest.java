package com.juego.juego;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueBowser;
import com.juego.patrones.strategy.AtaqueSalto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JuegoLuchaTest {

    @Test
    void debeRetornarUnGanador() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        Personaje bowser =
                new Personaje(
                        "Bowser",
                        150,
                        new AtaqueBowser());

        JuegoLucha juego =
                new JuegoLucha(
                        mario,
                        bowser);

        Personaje ganador =
                juego.iniciarCombate();

        assertNotNull(
                ganador);

        assertTrue(
                ganador.estaVivo());
    }

    @Test
    void elGanadorDebeSerUnoDeLosJugadores() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        Personaje bowser =
                new Personaje(
                        "Bowser",
                        150,
                        new AtaqueBowser());

        JuegoLucha juego =
                new JuegoLucha(
                        mario,
                        bowser);

        Personaje ganador =
                juego.iniciarCombate();

        boolean esMario =
                ganador.getNombre()
                        .equals("Mario");

        boolean esBowser =
                ganador.getNombre()
                        .equals("Bowser");

        assertTrue(
                esMario || esBowser);
    }
}