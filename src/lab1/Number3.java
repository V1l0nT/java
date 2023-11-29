package lab1;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []mas = new int [] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=0; i<10; i++) {
            sum += mas[i];
        }
        double sr = (double)sum/10;
        System.out.print("Сумма элементов массива: ");
        System.out.println(sum);
        System.out.print("Среднее арифметическое элементов: ");
        System.out.println(sr);
    }
}
