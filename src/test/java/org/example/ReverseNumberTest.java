package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseNumberTest {

    @Test
    public void reverseNumberTest() {
        Assertions.assertEquals(9876, ReverseNumber.reverse(6789));
        Assertions.assertEquals(4321, ReverseNumber.reverse(1234));
        Assertions.assertEquals(1234, ReverseNumber.reverse(4321));
    }

}