package org.example;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses; // тратим обязательные расходы
                money = money / 3; // остаток уменьшаем в 3 раза (отдых)
            } else {
                money = money + income - expenses; // работаем: получаем доход и тратим расходы
            }
        }
        return count;
    }
}
