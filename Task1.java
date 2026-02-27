import java.util.Scanner; // Імпорт сканера для введення даних

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Створення об'єкта для читання з консолі

        System.out.print("Введіть коефіцієнти a, b, c: ");
        double a = sc.nextDouble(); // Зчитування дійсного числа a
        double b = sc.nextDouble(); // Зчитування b
        double c = sc.nextDouble(); // Зчитування c

        // Обчислення дискримінанту: D = b^2 - 4ac
        double d = Math.pow(b, 2) - 4 * a * c;

        // Перевірка умови за допомогою оператора if-else
        if (d > 0) {
            // Якщо D > 0, рівняння має два корені
            double x1 = (-b + Math.sqrt(d)) / (2 * a); // Math.sqrt - квадратний корінь
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Два корені: x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (d == 0) {
            // Якщо D = 0, один корінь
            double x = -b / (2 * a);
            System.out.printf("Один корінь: x = %.2f", x);
        } else {
            // Якщо D < 0, дійсних коренів немає
            System.out.println("Рівняння не має дійсних коренів.");
        }
    }
}
