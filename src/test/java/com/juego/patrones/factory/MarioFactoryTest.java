package com.juego.patrones.factory;

import com.juego.model.Personaje;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarioFactoryTest {

    @Test
    void debeCrearMario() {

        Personaje mario =
                MarioFactory.crear(
                        TipoPersonaje.MARIO,
                        "Mario");

        assertEquals(
                "Mario",
                mario.getNombre());
    }

    @Test
    void debeCrearLuigi() {

        Personaje luigi =
                MarioFactory.crear(
                        TipoPersonaje.LUIGI,
                        "Luigi");

        assertEquals(
                "Luigi",
                luigi.getNombre());
    }

    @Test
    void debeCrearBowser() {

        Personaje bowser =
                MarioFactory.crear(
                        TipoPersonaje.BOWSER,
                        "Bowser");

        assertEquals(
                150,
                bowser.getPuntosDeVida());
    }

    @Test
    void debeCrearPeach() {

        Personaje peach =
                MarioFactory.crear(
                        TipoPersonaje.PEACH,
                        "Peach");

        assertEquals(
                "Peach",
                peach.getNombre());
    }
}