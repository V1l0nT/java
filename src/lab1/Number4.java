package lab1;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.print("Введите размер массива до 100 символов: ");
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        } else {
            System.out.println("Неверный ввод данных");
            return;
        }
        if (size < 1 || size > 100) {
            System.out.println("Размер массива некорректен");
            return;
        }
        int []mas = new int [size];
        int sum = 0;
        int i = 0;
        System.out.println("Введите " + size + " элемента(ов) целочисленного массива: ");
        do {
            if(sc.hasNextInt()) {
                mas[i] = sc.nextInt();
            } else {
                System.out.println("Неверный ввод данных");
                return;
            }
            i+=1;
        } while (i < size);
        i = 0;
        int min = mas[0];
        int max = mas[0];
        while (i < mas.length) {
            sum += mas[i];
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
            i += 1;
        }
        System.out.print("Сумма элементов: ");
        System.out.println(sum);
        System.out.print("Максимальный элемент: ");
        System.out.println(max);
        System.out.print("Минимальный элемент: ");
        System.out.println(min);
    }
}
