package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public abstract class PowerUpDecorator extends Personaje {

    protected Personaje decorado;

    public PowerUpDecorator(Personaje decorado) {

        super(
                decorado.getNombre(),
                decorado.getPuntosDeVida(),
                decorado.getEstrategia()
        );

        this.decorado = decorado;
    }
}