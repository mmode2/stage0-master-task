package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int newNumber = 0;
        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
            int reminder = number % 10;
            newNumber += (int) (reminder * Math.pow(10, (2 - i)));
            number /= 10;

        }

        System.out.println(newNumber);
    }

}
