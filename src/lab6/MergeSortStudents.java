package lab6;
import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {

    public static void main(String[] args) {
        // Создаем два списка студентов
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Dmitry", 3.5));
        list1.add(new Student("Vasiliy", 3.8));
        list1.add(new Student("Andrey", 4.0));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Mary", 3.2));
        list2.add(new Student("Alice", 3.7));
        list2.add(new Student("Nastya", 3.9));

        // Вызываем метод для объединения и сортировки списков
        List<Student> mergedList = mergeSort(list1, list2);

        // Выводим отсортированный список студентов
        for (Student student : mergedList) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }

    // Класс Student
    static class Student {
        private String name;
        private double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public double getGPA() {
            return gpa;
        }
    }

    // Метод для объединения и сортировки двух списков слиянием
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list1.size()) {
            if (list1.get(i).getGPA() < list2.get(j).getGPA()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        if (i < list1.size()) {
            while (i < list1.size()) {
                mergedList.add(list1.get(i));
                i++;
            }
        } else {
            while (j < list2.size()) {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        return mergedList;
    }
}