package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElipseTest {
    @Test
    void testGetSemiejeMayor() {
        Elipse elipse = new Elipse("test", 5, 8.0);
        assertEquals(5.0, elipse.getSemiejeMayor());
    }

    @Test
    void testSetSemiejeMayor() {
        Elipse elipse = new Elipse("test", 10.0, 8.0);
        elipse.setSemiejeMayor(6.0);
        assertEquals(6.0, elipse.getSemiejeMayor());
    }

    @Test
    void testGetSemiejeMenor() {
        Elipse elipse = new Elipse("test", 10.0, 8.0);
        assertEquals(4.0, elipse.getSemiejeMenor());
    }

    @Test
    void testSetSemiejeMenor() {
        Elipse elipse = new Elipse("test", 10.0, 8.0);
        elipse.setSemiejeMenor(5.0);
        assertEquals(5.0, elipse.getSemiejeMenor());
    }

    @Test
    void testArea() {
        Elipse elipse = new Elipse("test", 10.0, 8.0);
        assertEquals(Math.PI * 5.0 * 4.0, elipse.area());
    }
}