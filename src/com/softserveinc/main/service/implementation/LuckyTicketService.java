package com.softserveinc.main.service.implementation;

import com.softserveinc.main.service.LuckyTicketApi;

import java.util.InputMismatchException;

public abstract class LuckyTicketService implements LuckyTicketApi {

    @Override
    public int count(int value) throws InputMismatchException{
        int result = 0;
        String valueToString = Integer.toString(value);
        if (valueToString.length() % 2 != 0){
            throw new InputMismatchException("Ticket must be even.");
        }
            for (int currentValue = 0; currentValue <= value; currentValue++) {
                StringBuilder currentValueToString = new StringBuilder(Integer.toString(currentValue));
                StringBuilder valueToCount = format(currentValueToString, valueToString.length());
                if (isLucky(valueToCount)) {
                    result++;
                }
            }
        return result;
    }

    abstract boolean isLucky(StringBuilder value);

    private StringBuilder format(StringBuilder value, int length) {
        StringBuilder result = new StringBuilder();
        if (value.length() != length) {
            for (int i = 0; i < length - value.length(); i++) {
                result.append("0");
            }
            result.append(value);
        } else {
            result = value;
        }
        return result;
    }

}
