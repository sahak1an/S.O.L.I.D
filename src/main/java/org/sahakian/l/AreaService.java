package org.sahakian.l;

public class AreaService {
    private final Rectange figure;

    public AreaService(Rectange figure) {
        this.figure = figure;
    }

    public int getArea(){
        return figure.getHeight() * figure.getWidth();
    }
}
