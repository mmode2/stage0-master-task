package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int newNumber = 0;
        int length = String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
            int reminder = number % 10;
            newNumber += reminder;
            number /= 10;
        }

        System.out.println(newNumber);
    }

}
