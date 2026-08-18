package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberConvertorTest {
    @Test
    void shouldConvertOneToI(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("I", convertor.convert(1));
    }

    @Test
    void shouldConvertToII(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("II", convertor.convert(2));
    }

    @Test
    void shouldConvertToIII(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("III", convertor.convert(3));
    }

    @Test
    void shouldConvertToIV(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("IV", convertor.convert(4));
    }

}