package lab5;

import java.lang.Math.*;
import java.util.Scanner;
public class Multipliers {
    public static boolean prime (long n){
        for(long i = 2; i<=Math.sqrt(n); i++) {
            if (n % i==0) {
                return false;
            }
        }
        return true;
    }
    public static void recursion (long n, long d) {
        if (n<d) {
            return;
        } else if (n % d == 0 && prime(d)) {
            System.out.print(d + " ");
            recursion(n/d, 2);
        } else {
            recursion(n, d + 1);
        }
    }
    public static void main(String[] args) {
        long x;
        System.out.print("Введите натуральное число (>1) для вывода простых множителей: ");
        Scanner sc = new Scanner(System.in);
        try {
            x = sc.nextLong();
        } catch(Exception e)
        {
            System.out.println("Ввод некорректен: " + e);
            return;
        }
        if (x <= 1) {
            System.out.println("Введённое число не удовлетворяет условию");
        } else {
            System.out.println("Простые множители данного числа:");
            recursion(x, 2);
        }
    }
}
