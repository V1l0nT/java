package lab6;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingStudentsByGPA {
    public static class Student {
        String name;
        double GPA;
        Student (String name, double GPA) {
            this.name = name;
            this.GPA =  GPA / 100;
        }
        public double getGPA() {
            return this.GPA;
        }
        @Override
        public String toString() {
            return name + " " + GPA;
        }
    }
    public interface Comparator<T>{
        public int compareTo(T s1, T s2);
    }

    public static class StudentComparator implements Comparator<Student> {
        @Override
        public int compareTo(Student s1, Student s2) {
            if (s1.getGPA() > s2.getGPA()) {
                return 1;
            } else if (s1.getGPA() < s2.getGPA()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static class QuickSort {
        // Метод для выполнения быстрой сортировки
        public static <T> void quickSort(T[] arr, int left, int right, Comparator<T> comparator) {
            if (left < right) {
                // Находим индекс опорного элемента (позицию, на которой элемент должен стоять в отсортированном массиве)
                int partitionIndex = partition(arr, left, right, comparator);

                // Рекурсивно сортируем элементы слева и справа от опорного элемента
                quickSort(arr, left, partitionIndex - 1, comparator);
                quickSort(arr, partitionIndex + 1, right, comparator);
            }
        }

        // Метод для разделения массива на две части
        private static <T> int partition(T[] arr, int left, int right, Comparator<T> comparator) {
            // Выбираем опорный элемент (обычно последний элемент массива)
            T pivot = arr[right];

            // Индекс элемента, который меньше или равен опорному элементу
            int i = left - 1;

            for (int j = left; j < right; j++) {
                // Если текущий элемент меньше или равен опорному, меняем местами элементы
                if (comparator.compareTo(arr[j], pivot) > 0) {
                    i++;
                    swap(arr, i, j);
                }
            }

            // Помещаем опорный элемент в правильную позицию
            swap(arr, i + 1, right);

            // Возвращаем индекс опорного элемента
            return i + 1;
        }

        // Метод для обмена двух элементов в массиве
        private static <T> void swap(T[] arr, int i, int j) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        Student[]MIREA = new Student[10];
        MIREA[0] = new Student("Nikita", random.nextInt(200, 500));
        MIREA[1] = new Student("Andrey", random.nextInt(200, 500));
        MIREA[2] = new Student("Vasiliy", random.nextInt(200,500));
        MIREA[3] = new Student("Olga", random.nextInt(200,500));
        MIREA[4] = new Student("Vladimir", random.nextInt(200,500));
        MIREA[5] = new Student("Oksana", random.nextInt(200,500));
        MIREA[6] = new Student("Ivan", random.nextInt(200,500));
        MIREA[7] = new Student("Stepan", random.nextInt(200,500));
        MIREA[8] = new Student("Igor", random.nextInt(200,500));
        MIREA[9] = new Student("Ruslan", random.nextInt(200,500));
        System.out.println("Массив до сортировки:");
        for (int i = 0; i < 10; i++) {
            System.out.println(MIREA[i]);
        }
        System.out.println("\nМассив после сортировки:");
        QuickSort.quickSort(MIREA, 0, 9, new StudentComparator());
        for (int i = 0; i < 10; i++) {
            System.out.println(MIREA[i]);
        }
    }
}


