package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseStringTest(){
        assertEquals("abcd", ReverseString.reverseString("dcba"));
        assertEquals("lukog", ReverseString.reverseString("gokul"));
        assertNotEquals("abcd", ReverseString.reverseString("abcd"));
    }
}