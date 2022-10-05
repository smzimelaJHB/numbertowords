package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for Numbers to words.
 */
public class NumberToWordsTest 
{
    @Test
    public void invalidInputTest()
    {
        assertEquals(NumberToWords.sayNumber(new String[]{"P"}),"Please enter a valid number");
    }

    @Test
    public void emptyInputTest()
    {
        assertEquals(NumberToWords.sayNumber(new String[]{}),"Please provide at least one argument");
    }

    @Test
    public void mixedInvalidInputTest()
    {
        assertEquals(NumberToWords.sayNumber(new String[]{"78yZ9"}),"Please enter a valid number");
    }

    @Test
    public void zeroTest()
    {
        assertEquals(NumberToWords.sayNumber(new String[]{"0"}),"zero");
    }

    @Test
    public void morethanOneArgumentTest()
    {
        String[] arguments1 = new String[]{"1","2","3"};
        String[] arguments2 = new String[]{"120000000","7000","9", "77", "58"};
        assertEquals(NumberToWords.sayNumber(arguments1).replace("\n"," "),"one two three ");
        assertEquals(NumberToWords.sayNumber(arguments2).replace("\n"," "),"one hundred twenty million seven thousand nine seventy seven fifty eight ");
    }

    @Test
    public void oneDigitNumberTest()
    {
        assertEquals(NumberToWords.convert(1),"one");
        assertEquals(NumberToWords.convert(2),"two");
        assertEquals(NumberToWords.convert(3),"three");
        assertEquals(NumberToWords.convert(4),"four");
        assertEquals(NumberToWords.convert(5),"five");
        assertEquals(NumberToWords.convert(6),"six");
        assertEquals(NumberToWords.convert(7),"seven");
        assertEquals(NumberToWords.convert(8),"eight");
        assertEquals(NumberToWords.convert(9),"nine");
    }


    @Test
    public void twoDigitNumberTest()
    {
        assertEquals(NumberToWords.convert(10),"ten");
        assertEquals(NumberToWords.convert(22),"twenty two");
        assertEquals(NumberToWords.convert(73),"seventy three");
    }

    @Test
    public void threeDigitNumberTest()
    {
        assertEquals(NumberToWords.convert(110),"one hundred ten");
        assertEquals(NumberToWords.convert(722),"seven hundred twenty two");
        assertEquals(NumberToWords.convert(1000),"one thousand");
    }

    @Test
    public void bigNumbersTest()
    {
        assertEquals(NumberToWords.convert(1110),"one thousand, one hundred ten");
        assertEquals(NumberToWords.convert(77722),"seventy seven thousand, seven hundred twenty two");
        assertEquals(NumberToWords.convert(900000),"nine hundred thousand");
        assertEquals(NumberToWords.convert(77800000),"seventy seven million, eight hundred thousand");
    }
}
