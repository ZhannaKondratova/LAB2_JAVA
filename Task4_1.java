import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = sc.nextDouble();
        double f;

        // Реалізація розгалуження для трьох проміжків
        if (x < -2) {
            // Перша гілка: ctg(x)
            f = 1 / Math.tan(x);
        } else if (x >= -2 && x <= 2) {
            // Друга гілка: 9 * x^2
            f = 9 * Math.pow(x, 2);
        } else {
            // Третя гілка: sin^2(x)
            f = Math.pow(Math.sin(x), 2);
        }

        // Вивід результату з форматуванням (4 знаки після коми)
        System.out.printf("Значення функції f(x) = %.4f\n", f);
    }
}