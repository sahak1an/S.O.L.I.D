package org.sahakian.i;

public class PrinterService implements Device {
    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void fax() {
        //empty
    }

    @Override
    public void scan() {
        //empty
    }
}
