package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to33then3dot6() {
        double expected = 3.6;
        int x1 = 1;
        int y1 = 0;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when46to92then6dot4() {
        double expected = 6.4;
        int x1 = 4;
        int y1 = 6;
        int x2 = 9;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to05then7dot07() {
        double expected = 7.07;
        int x1 = 5;
        int y1 = 0;
        int x2 = 0;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}
