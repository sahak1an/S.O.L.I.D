package org.sahakian.s;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(4, 5);

        int area = rectangle.getArea();

        assertEquals(20,area);
    }
}