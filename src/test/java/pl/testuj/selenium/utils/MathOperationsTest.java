package pl.testuj.selenium.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pl.testuj.selenium.rules.PhotoOnFaiulure;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathOperationsTest {

    @Test
    void shouldAddCorrectly() {
        //given
        int someNumber = 2;
        int sum = someNumber + someNumber;

        //then
        assertEquals(sum, MathOperations.sum(someNumber, someNumber));
    }

    @Test
    void shouldAddCorrectlyWithNegativeNumbers() {
        //given
        int someNumber = -2;
        int sum = someNumber + someNumber;

        //then
        assertEquals(sum, MathOperations.sum(someNumber, someNumber));
    }

    @Test
    void shouldAddCorrectlyWithNegativeAndPositiveNumber() {
        //given
        int someNumber = 2;

        //then
        assertEquals(0, MathOperations.sum(someNumber, -someNumber));
    }

    @Test
    void shouldAddCorrectlyWithZero() {
        //given
        int someNumber = 2;
        int zero = 0;
        int sum = zero + someNumber;

        //then
        assertEquals(sum, MathOperations.sum(zero, someNumber));
    }

    @Test
    void sumShouldBeCommutative() {
        //given
        int someNumber = -2;
        int other = 4;

        //then
        assertEquals(MathOperations.sum(other, someNumber), MathOperations.sum(someNumber, other));
    }

}