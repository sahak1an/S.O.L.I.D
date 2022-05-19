package org.sahakian.o;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private static List<Object> cars = new ArrayList<>();


    public void printCars(){
        for (Object car : cars) {
            if (car instanceof Bmw){
                printBmw(car);
            }else if (car instanceof Audi){
                printAudi(car);
            }
        }
    }

    private void printAudi(Object car) {
        Audi audi = (Audi) car;
        System.out.println(audi.mark);
    }

    private void printBmw(Object car) {
        Bmw bmw = (Bmw) car;
        System.out.println(bmw.mark);
    }

    static class Bmw {
        private final String mark;

        Bmw(String mark) {
            this.mark = mark;
        }

        public String getMark() {
            return mark;
        }
    }

    static class Audi {
        private final String mark;

        Audi(String mark) {
            this.mark = mark;
        }

        public String getMark() {
            return mark;
        }
    }
}
