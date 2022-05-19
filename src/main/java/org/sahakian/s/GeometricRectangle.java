package org.sahakian.s;

public class GeometricRectangle {
    private final int a;
    private final int b;

    public GeometricRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea() {
        return a * b;
    }
}
