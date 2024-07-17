package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddNumberTest {
    @Test
    public void evenOrOddNum() {
        assertFalse(EvenOrOddNumber.evenOrOdd(213));
        assertTrue(EvenOrOddNumber.evenOrOdd(400));
    }

}