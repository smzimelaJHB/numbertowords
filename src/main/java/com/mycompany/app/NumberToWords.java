package com.mycompany.app;
import java.util.*;
/**
 * Convert a number to words
 */
public class NumberToWords
{
    // constant words for numbers from 0 to 19
    public static final String[] smallNumbers = {
        "", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    // constant words for multiples of 10 from 20 to 90
    public static final String[] multiplesOfTen = {
        "","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"   // 9
    };

    // convert a number to words using recursion for numbers greater than 100 
    public static String convert(final long n) {
        // for numbers less than 20 simply return the word that matches the number
        String result = "";
        if (n < 20) {
            return smallNumbers[(int)n];
        }
        /**
        * for numbers greater than 20, we need to split the number 
        * into two parts selecting the indexes of both arrays
        * the first part is the number of multiples of 10 and 
        * the second part is the number of small numbers
        */
        if (n < 100) {
            result = multiplesOfTen[(int)n / 10] + (((int)n % 10 != 0) ? " " : "") + smallNumbers[(int)n % 10];
            return result;
        }

        // from here downward concats the words for hundreds, thousands, millions, billions, trillions
        // recursively calls the convert method to convert the remaining number
        if (n < 1000) {
            String firstResult = smallNumbers[(int)n / 100] + " hundred" + (((int)n % 100 != 0) ? " " : "") + convert(n % 100);
            String secondResult = smallNumbers[(int)n / 100] + " hundred" + (((int)n % 100 != 0) ? " and " : "") + convert(n % 100);
            if((int)n == 100){
            result = firstResult;
            }else{
            result = secondResult;
            }
            return result;
        }

        if (n < 1000000) {
            String firstResult = convert(n / 1000) + " thousand" + (((int)n % 1000 != 0) ? ", " : "") + convert(n % 1000);
            String secondResultn = convert(n / 1000) + " thousand" + (((int)n % 1000 != 0) ? " and " : "") + convert(n % 1000);
            if((int)n>10000){
            result = secondResultn;
            }else{
            result = firstResult;
            }
            return result;
        }

        if (n < 1000000000) {
            return convert(n / 1000000) + " million" + ((n % 1000000 != 0) ? ", " : "") + convert(n % 1000000);
        }
        if (n < 1000000000000L) {
            return convert(n / 1000000000) + " billion" + ((n % 1000000000 != 0) ? ", " : "") + convert(n % 1000000000);
        }
        if(n < 1000000000000000L){
            return convert(n / 1000000000000L) + " trillion" + ((n % 1000000000000L != 0) ? ", " : "") + convert(n % 1000000000000L);
        }

        return convert(n / 1000000000000000L) + " quadrillion" + ((n % 1000000000000000L != 0) ? ", " : "") + convert(n % 1000000000000000L);
    }

    // driver method takes an array of strings as input from command line
    public static String sayNumber(String[] input){
        String output = "";
        String converted = "";
        if(input.length == 0) {
            return("Please provide at least one argument");
        }
        try { 
            for(int i=0;i<input.length;i++){
                Long number = Long.parseLong(input[i]);
                if (number == 0 && input.length == 1) {
                    System.out.println("Zero.");
                    return "Zero.";
                }
                converted = convert(number);
                output = output + converted.substring(0, 1).toUpperCase() + converted.substring(1)+".\n";
            }
            System.out.println(output);
            return output;
        }catch(Exception e){
            return("Please enter a valid number");
        }
    }

    // main method that calls the driver method
    public static void main(String[] args)
	{ 
        sayNumber(args); 
    }
}

