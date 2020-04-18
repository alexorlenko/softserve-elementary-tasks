package com.softserveinc.main.service.implementation;

public class PiterTicketService extends LuckyTicketService {

    @Override
    public boolean isLucky(StringBuilder valueToCount) {
        String[] string = valueToCount.toString().split("");
        boolean result = false;
        int countOddNumbers = 0;
        int countEvenNumbers = 0;
        for (int i = 0; i < string.length; i++) {
            if (i % 2 == 1) {
                countOddNumbers += Integer.parseInt(string[i]);
            } else {
                countEvenNumbers += Integer.parseInt(string[i]);
            }
        }
        if (countOddNumbers == countEvenNumbers) {
            result = true;
        }
        return result;
    }

}
