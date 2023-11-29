package lab5;

import java.lang.Math.*;
import java.util.Scanner;

public class IsPrime {
    public static boolean recursion (long n, long d){
        if (n % d == 0 && n != 2) {
            return false;
        } else if (d >= Math.ceil(Math.sqrt(n))) {
            return true;
        }
        return recursion(n, d+1);
    }
    public static void main(String[] args) {
        long x;
        System.out.print("Введите натуральное число (>1) для проверки на простоту: ");
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
            if (recursion(x, 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
