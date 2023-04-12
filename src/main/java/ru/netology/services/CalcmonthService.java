package ru.netology.services;

public class CalcmonthService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int counter = 0; // счетчик месяцев отдыха

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses; // money -= expenses; (так можно укоротить запись)
                money = money / 3; // money /= 3; (тоже самое)
                counter++;
            } else {
                money += income;
                money -= expenses;
            }

        }
        return counter;
    }
}
