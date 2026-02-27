import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int num = sc.nextInt(); // Читання цілого числа

        // Число двозначне, якщо воно в діапазоні [10, 99] або [-99, -10]
        // Math.abs(num) повертає модуль числа
        boolean isTwoDigit = (Math.abs(num) >= 10 && Math.abs(num) <= 99);

        // Число парне, якщо остача від ділення на 2 дорівнює 0
        boolean isEven = (num % 2 == 0);

        // Кінцева перевірка обох умов
        if (isTwoDigit && isEven) {
            System.out.println("Результат: Число " + num + " є двозначним і парним.");
        } else {
            System.out.println("Результат: Умова не виконана.");
        }
    }
}
