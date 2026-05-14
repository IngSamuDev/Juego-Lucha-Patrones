package com.juego.patrones.builder;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueSalto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeBuilderTest {

    @Test
    void builderDebeConstruirPersonaje() {

        Personaje personaje =
                new PersonajeBuilder()
                        .setNombre("Luigi")
                        .setVida(120)
                        .setEstrategia(
                                new AtaqueSalto())
                        .build();

        assertEquals(
                "Luigi",
                personaje.getNombre());

        assertEquals(
                120,
                personaje.getPuntosDeVida());
    }
}