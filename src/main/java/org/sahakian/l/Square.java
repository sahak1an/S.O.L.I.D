package org.sahakian.l;

public class Square extends Rectange {

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.height = width;
        this.width = width;
    }
}
