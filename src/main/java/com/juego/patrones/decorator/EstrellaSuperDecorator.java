package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class EstrellaSuperDecorator
        extends PowerUpDecorator {

    public EstrellaSuperDecorator(Personaje decorado) {
        super(decorado);
    }

    @Override
    public void atacar(Personaje oponente) {

        int dano =
                decorado.getEstrategia()
                        .calcularDano() * 2;

        oponente.recibirDano(dano);

        System.out.println(
                decorado.getNombre()
                        + " usó Estrella ⭐ y causó "
                        + dano
                        + " de daño.");
    }
}