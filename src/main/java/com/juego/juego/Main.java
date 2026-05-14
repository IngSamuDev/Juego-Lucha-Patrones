package com.juego;

import com.juego.juego.JuegoLucha;
import com.juego.model.Personaje;
import com.juego.patrones.decorator.EstrellaSuperDecorator;
import com.juego.patrones.decorator.FlorDeFuegoDecorator;
import com.juego.patrones.factory.MarioFactory;
import com.juego.patrones.factory.TipoPersonaje;

public class Main {

    public static void main(String[] args) {

        Personaje mario =
                MarioFactory.crear(
                        TipoPersonaje.MARIO,
                        "Mario");

        mario =
                new EstrellaSuperDecorator(
                        mario);

        mario =
                new FlorDeFuegoDecorator(
                        mario);

        Personaje bowser =
                MarioFactory.crear(
                        TipoPersonaje.BOWSER,
                        "Bowser");

        JuegoLucha juego =
                new JuegoLucha(
                        mario,
                        bowser);

        juego.iniciarCombate();
    }
}