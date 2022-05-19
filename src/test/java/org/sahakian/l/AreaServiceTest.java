package org.sahakian.l;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaServiceTest {

    @Test
    void getArea() {
        Rectange rectange = new Rectange();
        rectange.setHeight(3);
        rectange.setWidth(5);


        AreaService areaService = new AreaService(rectange);

        int area = areaService.getArea();

        assertEquals(15,area);
    }
}