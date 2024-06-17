package ru.netology.services;

public class FrilansService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                count++;

            } else {
                // работаем
                money += income;
                money -= expenses;
            }

        }
        return count;
    }
}
