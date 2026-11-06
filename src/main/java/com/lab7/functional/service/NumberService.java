package main.java.com.lab7.functional.service;

import main.java.com.lab7.functional.interfaces.NumberToWords;

public class NumberService {

    public String convertCustom(int number) {

        NumberToWords converter = value -> convertNumber(value);

        return converter.convert(number);
    }

    public String convertStandard(int number) {

        java.util.function.Function<Integer, String> converter = value -> convertNumber(value);

        return converter.apply(number);
    }

    private String convertNumber(int number) {

        if (number < 0 || number > 9999) {
            return "Number must be between 0 and 9999";
        }

        if (number == 0) {
            return "zero";
        }

        String[] ones = {
                "", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        String[] teens = {
                "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String[] hundreds = {
                "", "one hundred", "two hundred", "three hundred",
                "four hundred", "five hundred", "six hundred",
                "seven hundred", "eight hundred", "nine hundred"
        };

        String result = "";

        int thousands = number / 1000;
        int remainder = number % 1000;

        if (thousands > 0) {
            result += ones[thousands] + " thousand ";
        }

        int hundred = remainder / 100;
        result += hundreds[hundred];

        int rest = remainder % 100;

        if (rest > 0 && hundred > 0) {
            result += " ";
        }

        if (rest >= 10 && rest <= 19) {
            result += teens[rest - 10];
        } else {
            int ten = rest / 10;
            int one = rest % 10;

            if (ten > 0) {
                result += tens[ten];
            }

            if (ten > 0 && one > 0) {
                result += "-";
            }

            if (one > 0) {
                result += ones[one];
            }
        }

        return result.trim();
    }
}
