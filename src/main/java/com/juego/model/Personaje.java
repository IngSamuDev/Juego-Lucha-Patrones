package com.juego.model;

import com.juego.patrones.strategy.EstrategiaAtaque;

public class Personaje {

    protected String nombre;
    protected int puntosDeVida;
    protected EstrategiaAtaque estrategia;

    public Personaje(
            String nombre,
            int puntosDeVida,
            EstrategiaAtaque estrategia) {

        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.estrategia = estrategia;
    }

    public void atacar(Personaje oponente) {

        int dano = estrategia.calcularDano();

        oponente.recibirDano(dano);

        System.out.println(
                nombre + " atacó a "
                        + oponente.getNombre()
                        + " causando "
                        + dano
                        + " puntos de daño.");
    }

    public void recibirDano(int dano) {

        if (dano < 0) {
            return;
        }

        puntosDeVida -= dano;

        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public void aumentarVida(int vida) {
        puntosDeVida += vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public EstrategiaAtaque getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
    }
}