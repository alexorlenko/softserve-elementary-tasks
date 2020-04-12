package com.softserveinc.service;

public class NumberToStringService implements NumberToStringApi {
    @Override
    public String transform(int number) {

        return null;
    }
}
class NumberToText {

    private static String numText;

    private static final String[][] sampleText = {{"", "од", "дв", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"", "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "},
            {"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "}};

    private static final String[] sample11to19 = {"десять ", "одинадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ",
            "шеснадцать ", "семьнадцать ", "восемьнадцать ", "девятнадцать ", "девятнадцать "};

    private static final String[][] textMillion = {{"", "", "", ""},
            {"миллиардов ", "миллионов ", "тысячь ", ""},
            {"миллиард ", "миллион ", "тысяча ", ""},
            {"миллиарда ", "миллиона ", "тысячи ", ""},
            {"миллиардов ", "миллионов ", "тысячь ", ""}};

    static String WordsRus(long number) {
        long numberA = number;

        numText = "";
        long numberMax = 999999999999L;
        if (numberA < -numberMax || numberA > numberMax) {
            return numText = "Number out of range";
        }
        if (numberA == 0) {
            return numText = "ноль ";
        }
        if (number < 0) {
            numText = "минус ";
            numberA = -numberA;
        }

        int billion = (int) (numberA / 1000000000);
        int million = (int) (numberA - (billion * 1000000000)) / 1000000;
        int thousand = (int) (numberA - (billion * 1000000000) - (million * 1000000)) / 1000;
        int toThousand = (int) (numberA % 1000);

        numText = numText + WordsToThousand(billion, 0) + WordsToThousand(million, 1)
                + WordsToThousand(thousand, 2) + WordsToThousand(toThousand, 3);
        return numText;
    }

    private static String WordsToThousand(int numericalValue, int index) {

        int hundreds = numericalValue / 100;
        int decimal = (numericalValue - (hundreds * 100)) / 10;
        int units = numericalValue % 10;

        numText = "";
        if (decimal == 1) numText = sampleText[2][hundreds] + sample11to19[units];
        else numText = sampleText[2][hundreds] + sampleText[1][decimal] + sampleText[0][units];

        if (index == 2) {
            if (units == 1 && decimal != 1) numText = numText + "на ";
            else if (units == 2 & decimal != 1) numText = numText + "е ";
            if (units > 1 && decimal != 1) numText = numText + " ";
        } else {
            if (units == 1 && decimal != 1) numText = numText + "ин";
            if (units == 2 & decimal != 1) {
                numText = numText + "а ";
            } else if (units != 0 & decimal != 1) numText = numText + " ";
        }

        int indexA = 0;
        if (numericalValue != 0) {
            if (units == 0 || decimal == 1) indexA = 1;
            else if (units == 1) indexA = 2;
            else if (units < 5) indexA = 3;
            else indexA = 4;
        }
        numText = numText + textMillion[indexA][index];
        return numText;
    }
}