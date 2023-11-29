package lab6;

import java.util.*;
public class InsertionSort{
    public static class Student{
        String name;
        int ID;
        Student(String name, int ID) {
            this.ID = ID;
            this.name = name;
        }
        public int ID() {
            return this.ID;
        }
        public String name() {
            return this.name;
        }
        @Override
        public String toString() {
            return name + " " + ID;
        }
    }
    public static void sort(Student[] list) {
        Student temp;
        for (int i = 1; i < list.length; i++) {
           Student key = list[i];
           int j = i;
           while (j > 0 && key.ID < list[j-1].ID) {
                list[j] = list[j - 1];
                j--;
           }
           list[j] = key;
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        Student[]iDNumber = new Student [10];
        iDNumber[0] = new Student("Nikita", random.nextInt(10000));
        iDNumber[1] = new Student("Andrey", random.nextInt(10000));
        iDNumber[2] = new Student("Vasiliy", random.nextInt(10000));
        iDNumber[3] = new Student("Olga", random.nextInt(10000));
        iDNumber[4] = new Student("Vladimir", random.nextInt(10000));
        iDNumber[5] = new Student("Oksana", random.nextInt(10000));
        iDNumber[6] = new Student("Ivan", random.nextInt(10000));
        iDNumber[7] = new Student("Stepan", random.nextInt(10000));
        iDNumber[8] = new Student("Igor", random.nextInt(10000));
        iDNumber[9] = new Student("Ruslan", random.nextInt(10000));
        System.out.println("Массив до сортировки:");
        for (int i = 0; i < 10; i++) {
            System.out.println(iDNumber[i]);
        }
        System.out.println("\nМассив после сортировки:");
        sort(iDNumber);
        for (int i = 0; i < 10; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}