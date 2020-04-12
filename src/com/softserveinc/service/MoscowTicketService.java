package com.softserveinc.service;

public class MoscowTicketService implements LuckyTicketApi {
    public static void main(String[] args) {
        MoscowTicketService moscowTicketService = new MoscowTicketService();
        System.out.println(moscowTicketService.count(999999));
    }

    @Override
    public int count(int value) {
        int result = 0;
        String valueToString = Integer.toString(value);
        for (int currentValue = 0; currentValue <= value; currentValue++) {
            StringBuilder currentValueToString = new StringBuilder(Integer.toString(currentValue));
            StringBuilder valueToCount = new StringBuilder();
            if (currentValueToString.length() != valueToString.length()) {
                for (int i = 0; i < valueToString.length() - currentValueToString.length(); i++) {
                    valueToCount.append("0");
                }
                valueToCount.append(currentValueToString);
            } else {
                valueToCount = currentValueToString;
            }
            String[] string = valueToCount.toString().split("");
            int countFirstPart = 0;
            int countSecondPart = 0;
            for (int i = 0; i < string.length / 2; i++) {
                countFirstPart += Integer.parseInt(string[i]);
            }
            for (int i = string.length / 2; i < string.length; i++) {
                countSecondPart += Integer.parseInt(string[i]);
            }
            if (countFirstPart == countSecondPart) {
                result++;
            }
        }
        return result;
    }

}
