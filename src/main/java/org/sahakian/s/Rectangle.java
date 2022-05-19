package org.sahakian.s;

import java.awt.*;
import javax.swing.*;

public class Rectangle extends JComponent {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea() {
        return a * b;
    }

    @Override
    public void print(Graphics g) {
        // Graphic impl.
    }
}