package org.sahakian.o;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private static List<MarkPrinter> cars = new ArrayList<>();


    public void printCars(){
        for (MarkPrinter car : cars) {
            car.printMark();
        }
    }

    static interface MarkPrinter{
        void printMark();
    }

    static class Bmw implements MarkPrinter{
        private final String mark;

        Bmw(String mark) {
            this.mark = mark;
        }

        public String getMark() {
            return mark;
        }

        @Override
        public void printMark() {
            System.out.println(mark);
        }
    }

    static class Audi implements MarkPrinter{
        private final String mark;

        Audi(String mark) {
            this.mark = mark;
        }

        public String getMark() {
            return mark;
        }

        @Override
        public void printMark() {
            System.out.println(mark);
        }
    }
}
