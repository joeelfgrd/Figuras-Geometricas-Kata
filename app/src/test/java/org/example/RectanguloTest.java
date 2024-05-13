package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {
    @Test
    void testGetBase() {
        Rectangulo rectangulo = new Rectangulo("test", 5.0, 10.0);
        assertEquals(5.0, rectangulo.getBase());
    }

    @Test
    void testSetBase() {
        Rectangulo rectangulo = new Rectangulo("test", 5.0, 10.0);
        rectangulo.setBase(7.0);
        assertEquals(7.0, rectangulo.getBase());
    }

    @Test
    void testGetAltura() {
        Rectangulo rectangulo = new Rectangulo("test", 5.0, 10.0);
        assertEquals(10.0, rectangulo.getAltura());
    }

    @Test
    void testSetAltura() {
        Rectangulo rectangulo = new Rectangulo("test", 5.0, 10.0);
        rectangulo.setAltura(8.0);
        assertEquals(8.0, rectangulo.getAltura());
    }

    @Test
    void testGetArea() {
        Rectangulo rectangulo = new Rectangulo("test", 5.0, 10.0);
        assertEquals(50.0, rectangulo.area());
    }
}