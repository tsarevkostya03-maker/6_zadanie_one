package org.example;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3; // остаток после отдыха (1/3 от суммы после expenses)
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
