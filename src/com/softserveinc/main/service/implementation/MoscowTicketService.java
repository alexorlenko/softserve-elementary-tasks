package com.softserveinc.main.service.implementation;

public class MoscowTicketService extends LuckyTicketService {

    @Override
    public boolean isLucky(StringBuilder valueToCount) {
        String[] string = valueToCount.toString().split("");
        boolean result = false;
        int countFirstPart = 0;
        int countSecondPart = 0;
        for (int i = 0; i < string.length / 2; i++) {
            countFirstPart += Integer.parseInt(string[i]);
        }
        for (int i = string.length / 2; i < string.length; i++) {
            countSecondPart += Integer.parseInt(string[i]);
        }
        if (countFirstPart == countSecondPart) {
            result = true;
        }
        return result;
    }

}
