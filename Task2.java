import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть координату x: ");
        double x = sc.nextDouble();
        System.out.print("Введіть координату y: ");
        double y = sc.nextDouble();

        // Використання вкладених умов if-else if для вибору шляху
        if (x > 0 && y > 0) {
            System.out.println("Точка в I квадранті");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка в II квадранті");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в III квадранті");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в IV квадранті");
        } else {
            // Якщо хоча б одна координата дорівнює 0
            System.out.println("Точка лежить на одній з осей координат");
        }
    }
}
