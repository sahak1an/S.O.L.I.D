package org.sahakian.s;

/**
 * YAGNI principle ("You Aren't Gonna Need It")
 */
public interface Phone {
    void on();
    void unlock(String pass);
    void call(String number);
}