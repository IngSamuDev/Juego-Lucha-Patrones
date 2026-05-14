package com.juego.patrones.builder;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.EstrategiaAtaque;

public class PersonajeBuilder {

    private String nombre;
    private int vida = 100;
    private EstrategiaAtaque estrategia;

    public PersonajeBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonajeBuilder setVida(int vida) {
        this.vida = vida;
        return this;
    }

    public PersonajeBuilder setEstrategia(
            EstrategiaAtaque estrategia) {

        this.estrategia = estrategia;
        return this;
    }

    public Personaje build() {

        return new Personaje(
                nombre,
                vida,
                estrategia
        );
    }
}