package lab1;

import java.util.Scanner;
public class Number7 {
    public static long fact(int a) {
        if (a == 0) return 1;
        else if (a == 1) return 1;
        else return (a * fact(a - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Введите число (от 0 до 25): ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        } else {
            System.out.println("Неверный ввод данных");
            return;
        }
        if (i < 0) {
            System.out.println("Факториал можно посчитать только для положительных чисел");
        } else if (i >25) {
            System.out.println("Число слишком большое");
        } else {
            System.out.println("Факториал числа " + i + ": " + fact(i));
        }
    }
}
