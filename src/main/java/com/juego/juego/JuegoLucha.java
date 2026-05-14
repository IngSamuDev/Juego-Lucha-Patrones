package com.juego.juego;

import com.juego.model.Personaje;

public class JuegoLucha {

    private Personaje jugador1;
    private Personaje jugador2;
    private int turno;

    public JuegoLucha(
            Personaje jugador1,
            Personaje jugador2) {

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turno = 1;
    }

    public Personaje iniciarCombate() {

        System.out.println(
                "🔥 COMIENZA EL COMBATE 🔥");

        while (jugador1.estaVivo()
                && jugador2.estaVivo()) {

            System.out.println(
                    "\n===== TURNO "
                            + turno
                            + " =====");

            jugador1.atacar(jugador2);

            System.out.println(
                    jugador2.getNombre()
                            + " HP: "
                            + jugador2.getPuntosDeVida());

            if (!jugador2.estaVivo()) {
                break;
            }

            jugador2.atacar(jugador1);

            System.out.println(
                    jugador1.getNombre()
                            + " HP: "
                            + jugador1.getPuntosDeVida());

            turno++;
        }

        Personaje ganador =
                jugador1.estaVivo()
                        ? jugador1
                        : jugador2;

        System.out.println(
                "\n🏆 EL GANADOR ES: "
                        + ganador.getNombre());

        return ganador;
    }
}