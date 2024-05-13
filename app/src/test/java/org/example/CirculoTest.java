package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    void testGetRadio() {
        Circulo circulo = new Circulo("circulo1", 5.0);
        assertEquals(5.0, circulo.getRadio());
    }

    @Test
    void testSetRadio() {
        Circulo circulo = new Circulo("circulo2", 5.0);
        circulo.setRadio(10.0);
        assertEquals(10.0, circulo.getRadio());
    }

    @Test
    void testGetArea() {
        Circulo circulo = new Circulo("circulo3", 5.0);
        assertEquals(Math.PI * 5.0 * 5.0, circulo.area());
    }
}