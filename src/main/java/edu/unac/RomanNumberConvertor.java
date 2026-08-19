package edu.unac;

import java.util.List;

public class RomanNumberConvertor {

    private record RomanSymbol(int value, String symbol){};
    private static final List<RomanSymbol> SYMBOLS = List.of(
            new RomanSymbol(90, "XC"),
            new RomanSymbol(50, "L"),
            new RomanSymbol(40, "XL"),
            new RomanSymbol(10, "X"),
            new RomanSymbol(9, "IX"),
            new RomanSymbol(5, "V"),
            new RomanSymbol(4, "IV"),
            new RomanSymbol(1, "I")
    );

    public String convert(int number) {
        String result = "";
        for (RomanSymbol romanSymbol : SYMBOLS){
            while (number >= romanSymbol.value()){
                result += romanSymbol.symbol();
                number -= romanSymbol.value();
            }
        }
        return result;
    }
}
