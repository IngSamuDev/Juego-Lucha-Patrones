package com.juego.model;

import com.juego.patrones.strategy.AtaqueBowser;
import com.juego.patrones.strategy.AtaqueSalto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    void personajeDebeEstarVivo() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        assertTrue(
                mario.estaVivo());
    }

    @Test
    void personajeDebeRecibirDano() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        mario.recibirDano(30);

        assertEquals(
                70,
                mario.getPuntosDeVida());
    }

    @Test
    void personajeDebeMorir() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        mario.recibirDano(150);

        assertFalse(
                mario.estaVivo());
    }

    @Test
    void personajeDebeAtacar() {

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

        mario.atacar(bowser);

        assertTrue(
                bowser.getPuntosDeVida() < 100);
    }

    @Test
    void gettersDebenFuncionar() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        120,
                        new AtaqueSalto());

        assertEquals(
                "Mario",
                mario.getNombre());

        assertEquals(
                120,
                mario.getPuntosDeVida());

        assertNotNull(
                mario.getEstrategia());
    }

    @Test
    void debeAumentarVida() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        mario.aumentarVida(50);

        assertEquals(
                150,
                mario.getPuntosDeVida());
    }

    @Test
    void debeCambiarEstrategia() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        mario.setEstrategia(
                new AtaqueBowser());

        assertTrue(
                mario.getEstrategia()
                        instanceof AtaqueBowser);
    }

    @Test
    void recibirDanoNoDebeDejarVidaNegativa() {

        Personaje mario =
                new Personaje(
                        "Mario",
                        100,
                        new AtaqueSalto());

        mario.recibirDano(500);

        assertTrue(
                mario.getPuntosDeVida() <= 0);
    }
}