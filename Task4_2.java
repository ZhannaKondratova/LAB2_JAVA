import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Оберіть підпункт завдання 4.2 (1-7):");
        int choice = sc.nextInt();

        // Оператор switch порівнює значення виразу choice з варіантами case
        switch (choice) {
            case 1: // Робочий або вихідний день
                System.out.print("Введіть номер дня тижня (1-7): ");
                int day = sc.nextInt();
                switch (day) {
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("Це робочий день."); break; // break для виходу зі switch
                    case 6: case 7:
                        System.out.println("Це вихідний!"); break;
                    default: System.out.println("Невірний номер дня."); // блок за замовчуванням
                }
                break;

            case 2: // Пора року
                System.out.print("Введіть номер місяця (1-12): ");
                int month = sc.nextInt();
                switch (month) {
                    case 12: case 1: case 2: System.out.println("Зима"); break;
                    case 3: case 4: case 5: System.out.println("Весна"); break;
                    case 6: case 7: case 8: System.out.println("Літо"); break;
                    case 9: case 10: case 11: System.out.println("Осінь"); break;
                }
                break;

            case 3: // Кількість днів
                System.out.print("Введіть місяць: ");
                int m = sc.nextInt();
                switch (m) {
                    case 2: System.out.println("28 або 29 днів"); break;
                    case 4: case 6: case 9: case 11: System.out.println("30 днів"); break;
                    default: System.out.println("31 день");
                }
                break;

            case 6: // Чверть години
                System.out.print("Введіть число від 0 до 59: ");
                int min = sc.nextInt();
                // Логічне групування хвилин по чвертях
                int q = (min / 15) + 1;
                switch (q) {
                    case 1: System.out.println("Перша чверть"); break;
                    case 2: System.out.println("Друга чверть"); break;
                    case 3: System.out.println("Третя чверть"); break;
                    case 4: System.out.println("Четверта чверть"); break;
                }
                break;

            case 7: // Просте меню (Калькулятор)
                System.out.print("Введіть два числа: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("1-Добуток, 2-Сума, 3-Різниця");
                int op = sc.nextInt();
                switch (op) {
                    case 1: System.out.println("Добуток: " + (a * b)); break;
                    case 2: System.out.println("Сума: " + (a + b)); break;
                    case 3: System.out.println("Різниця: " + (a - b)); break;
                }
                break;

            default:
                System.out.println("Завдання з таким номером не знайдено.");
        }
    }
}
