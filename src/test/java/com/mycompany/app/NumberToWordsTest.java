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
        assertEquals(NumberToWords.sayNumber(new String[]{"0"}),"Zero.");
    }

    @Test
    public void morethanOneArgumentTest()
    {
        String[] arguments1 = new String[]{"1","2","3"};
        String[] arguments2 = new String[]{"120000000","7000","9", "77", "58"};
        assertEquals(NumberToWords.sayNumber(arguments1).replace("\n"," "),"One. Two. Three. ");
        assertEquals(NumberToWords.sayNumber(arguments2).replace("\n"," "),"One hundred and twenty million. Seven thousand. Nine. Seventy seven. Fifty eight. ");
    }

    @Test
    public void oneDigitNumberTest()
    {
        String[] arguments = new String[]{"1","2","3","4","5","6","7","8","9"};
        assertEquals(NumberToWords.sayNumber(arguments).replace("\n"," "),"One. Two. Three. Four. Five. Six. Seven. Eight. Nine. ");
    }


    @Test
    public void twoDigitNumberTest()
    {
        String[] arguments = new String[]{"10","20","30","40","50","60","70","80","90"};
        assertEquals(NumberToWords.sayNumber(arguments).replace("\n"," "),"Ten. Twenty. Thirty. Forty. Fifty. Sixty. Seventy. Eighty. Ninety. ");
    }

    @Test
    public void threeDigitNumberTest()
    {
        String[] arguments = new String[]{"110", "722", "1000"};
        assertEquals(NumberToWords.sayNumber(arguments).replace("\n"," "),"One hundred and ten. Seven hundred and twenty two. One thousand. ");
    }

    @Test
    public void bigNumbersTest()
    {
        String[] arguments = new String[]{"9000000"};
        assertEquals(NumberToWords.sayNumber(arguments).replace("\n"," "),"Nine million. ");
        String[] arguments1 = new String[]{"90376000010012"};
        assertEquals(NumberToWords.sayNumber(arguments1).replace("\n"," "),"Ninety trillion, three hundred and seventy six billion, ten thousand and twelve. ");
    }
}
