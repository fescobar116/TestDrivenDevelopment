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

    @Test
    void shouldConvertToV(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("V", convertor.convert(5));
    }
    @Test
    void shouldConvertToVI(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("VI", convertor.convert(6));
    }

    @Test
    void shouldConvertToVII(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("VII", convertor.convert(7));
    }

    @Test
    void shouldConvertToIX(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("IX", convertor.convert(9));
    }

    @Test
    void shouldConvertToX(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("X", convertor.convert(10));
    }

    @Test
    void shouldConvertToXI(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XI", convertor.convert(11));
    }

    @Test
    void shouldConvertToXIV(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XIV", convertor.convert(14));
    }

    @Test
    void shouldConvertToXV(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XV", convertor.convert(15));
    }

    @Test
    void shouldConvertToXVI(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XVI", convertor.convert(16));
    }

    @Test
    void shouldConvertToXVIII(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XVIII", convertor.convert(18));
    }

    @Test
    void shouldConvertToXIX(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XIX", convertor.convert(19));
    }

    @Test
    void shouldConvertToXX(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XX", convertor.convert(20));
    }

    @Test
    void shouldConvertToXXI(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XXI", convertor.convert(21));
    }

    @Test
    void shouldConvertToXL(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XL", convertor.convert(40));
    }

    @Test
    void shouldConvertToL(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("L", convertor.convert(50));
    }

    @Test
    void shouldConvertToLXXIX(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("LXXIX", convertor.convert(79));
    }

    @Test
    void shouldConvertToXC(){
        RomanNumberConvertor convertor = new RomanNumberConvertor();

        assertEquals("XC", convertor.convert(90));
    }
}