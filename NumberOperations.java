
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Деление с проверкой деления на ноль
        if (b != 0) {
            System.out.println("a / b = " + ((double)a / b)); // Используем double для точного деления
        } else {
            System.out.println("a / b = деление на ноль!");
        }

        scanner.close();
    }
}

