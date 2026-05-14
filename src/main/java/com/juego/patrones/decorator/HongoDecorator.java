package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class HongoDecorator
        extends PowerUpDecorator {

    public HongoDecorator(Personaje decorado) {

        super(decorado);

        this.puntosDeVida += 50;
    }

    public void aumentarVida() {

        System.out.println(
                decorado.getNombre()
                        + " obtuvo +50 HP 🍄");
    }
}