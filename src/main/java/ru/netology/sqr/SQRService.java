package ru.netology.sqr;

public class SQRService {
    public int NumbersSquared (int numberMin, int numberMax) {
        int counter = 0;
        for (int numbers = 10; numbers < 100; numbers++) {
            int NumbersSquared = numbers * numbers;
            if (NumbersSquared >= numberMin && NumbersSquared <= numberMax) {
                counter ++;
            }
        }
        return counter;
    }
}