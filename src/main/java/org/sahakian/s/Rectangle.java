package org.sahakian.s;

import java.awt.*;
import javax.swing.*;

public class Rectangle extends JComponent {
    private final GeometricRectangle geometricRectangle;

    public Rectangle(GeometricRectangle geometricRectangle) {
        this.geometricRectangle = geometricRectangle;
    }

    @Override
    public void print(Graphics g) {
        // Graphic impl.
    }
}