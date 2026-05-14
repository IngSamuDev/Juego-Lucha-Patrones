package com.juego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void mainNoDebeLanzarErrores() {

        assertDoesNotThrow(() -> {

            Main.main(new String[]{});

        });
    }
}