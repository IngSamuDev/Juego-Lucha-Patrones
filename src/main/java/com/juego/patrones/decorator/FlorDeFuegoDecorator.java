package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class FlorDeFuegoDecorator
        extends PowerUpDecorator {

    public FlorDeFuegoDecorator(Personaje decorado) {
        super(decorado);
    }

    @Override
    public void atacar(Personaje oponente) {

        decorado.atacar(oponente);

        oponente.recibirDano(15);

        System.out.println(
                decorado.getNombre()
                        + " lanzó fuego extra 🌸");
    }
}