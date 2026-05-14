package com.juego.patrones.factory;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueBolaDeFuego;
import com.juego.patrones.strategy.AtaqueBowser;
import com.juego.patrones.strategy.AtaqueSalto;

public class MarioFactory {

    public static Personaje crear(
            TipoPersonaje tipo,
            String nombre) {

        switch (tipo) {

            case MARIO:
                return new Personaje(
                        nombre,
                        100,
                        new AtaqueSalto());

            case LUIGI:
                return new Personaje(
                        nombre,
                        100,
                        new AtaqueSalto());

            case BOWSER:
                return new Personaje(
                        nombre,
                        150,
                        new AtaqueBowser());

            case PEACH:
                return new Personaje(
                        nombre,
                        90,
                        new AtaqueBolaDeFuego());

            default:
                throw new IllegalArgumentException(
                        "Tipo de personaje inválido");
        }
    }
}