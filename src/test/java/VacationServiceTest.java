import org.example.VacationService;

public class VacationServiceTest {
    public static void main(String[] args) {
        VacationService service = new VacationService();

        // Тест 1: income=10000, expenses=3000, threshold=20000
        int result1 = service.calculate(10000, 3000, 20000);
        System.out.println("Тест 1: income=10000, expenses=3000, threshold=20000");
        System.out.println("Ожидаемый результат: 3 месяца отдыха");
        System.out.println("Фактический результат: " + result1 + " месяцев отдыха");
        System.out.println("Тест " + (result1 == 3 ? "ПРОЙДЕН" : "НЕ ПРОЙДЕН"));
        System.out.println();

        // Тест 2: income=100000, expenses=60000, threshold=150000
        int result2 = service.calculate(100000, 60000, 150000);
        System.out.println("Тест 2: income=100000, expenses=60000, threshold=150000");
        System.out.println("Ожидаемый результат: 2 месяца отдыха");
        System.out.println("Фактический результат: " + result2 + " месяцев отдыха");
        System.out.println("Тест " + (result2 == 2 ? "ПРОЙДЕН" : "НЕ ПРОЙДЕН"));
        System.out.println();

        // Детальная эмуляция для первого теста
        System.out.println("=== Детальная эмуляция первого теста ===");
        emulateMonths(10000, 3000, 20000);
    }

    private static void emulateMonths(int income, int expenses, int threshold) {
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");

            if (money >= threshold) {
                System.out.println("Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + (money - expenses - (money - expenses)/3));
                money = money - expenses;
                money = money / 3;
            } else {
                System.out.println("Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            }
        }
    }
}
