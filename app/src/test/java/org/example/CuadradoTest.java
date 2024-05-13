package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {
    @Test
    void testGetlado() {
        Cuadrado cuadrado = new Cuadrado("cuadrado1", 5.0);
        assertEquals(5.0, cuadrado.getLado());
    }

    @Test
    void testSetlado() {
        Cuadrado cuadrado = new Cuadrado("cuadrado2", 15.0);
        cuadrado.setLado(15.0);
        assertEquals(15.0, cuadrado.getLado());
    }


    @Test
    void testGetArea() {
        Cuadrado cuadrado = new Cuadrado("cuadrado3", 5.0);
        assertEquals(25.0, cuadrado.area());
    }
}