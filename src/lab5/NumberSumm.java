package lab5;

import java.util.Scanner;

public class NumberSumm {
    public static long recursion (long n) {
        if (n == 0) {return 0;}
        return recursion(n/10)+n%10;
    }
    public static void main(String[] args) {
        long x;
        System.out.print("Введите натуральное число для нахождения суммы его цифр: ");
        Scanner sc = new Scanner(System.in);
        try {
            x = sc.nextLong();
        } catch(Exception e)
        {
            System.out.println("Ввод некорректен: " + e);
            return;
        }
        if (x <= 0) {
            System.out.println("Введённое число не является натуральным");
        } else {
            System.out.println("Сумма цифр числа: " + recursion(x));
        }
    }
}
