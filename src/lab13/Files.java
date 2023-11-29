package lab13;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Введите информацию в файл (для завершения ввода введите 0 на отдельной строке):");
        try (FileWriter writer = new FileWriter("C:\\Users\\1\\OneDrive\\Рабочий стол\\Для ВУЗа\\2 курс" +
                "\\Программирование на Java\\Текст1.txt", false)) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                String text = sc.nextLine();
                if (text.equalsIgnoreCase("0")) {
                    break;
                }
                writer.write(text);
            }
            writer.flush();
        }
        catch (IOException e){
            System.out.println("\nОтловлена ошибка при записи в файл:" + e.getMessage());
        }
        //Задание 2
        System.out.println("Содержимое файла:");
        try(FileReader reader = new FileReader("C:\\Users\\1\\OneDrive\\Рабочий стол\\Для ВУЗа\\2 курс" +
                "\\Программирование на Java\\Текст1.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException e){
            System.out.println("\nОтловлена ошибка при чтении файла:" + e.getMessage());
        }
        //Задание 3
        System.out.println("\nВведите информацию в файл для замены старых данных (для завершения ввода введите 0 " +
                "на отдельной строке):");
        try (FileWriter writer = new FileWriter("C:\\Users\\1\\OneDrive\\Рабочий стол\\Для ВУЗа\\2 курс" +
                "\\Программирование на Java\\Текст1.txt", false)) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                String text = sc.nextLine();
                if (text.equalsIgnoreCase("0")) {
                    break;
                }
                writer.write(text);
            }
            writer.flush();
        }
        catch (IOException e){
            System.out.println("\nОтловлена ошибка при записи в файл:" + e.getMessage());
        }
        //Задание 4
        System.out.println("\nВведите информацию в файл для дозаписи в файл (для завершения ввода введите 0 " +
                "на отдельной строке):");
        try (FileWriter writer = new
                FileWriter("C:\\Users\\1\\OneDrive\\Рабочий стол\\Для ВУЗа\\2 курс" +
                "\\Программирование на Java\\Текст1.txt", true)) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                String text = sc.nextLine();
                if (text.equalsIgnoreCase("0")) {
                    break;
                }
                writer.write(text);
            }
            writer.flush();
        }
        catch (IOException e){
            System.out.println("\nОтловлена ошибка при записи в файл:" + e.getMessage());
        }
        System.out.println("\nОкончательный результат:");
        try(FileReader reader = new
                FileReader("C:\\Users\\1\\OneDrive\\Рабочий стол\\Для ВУЗа\\2 курс" +
                "\\Программирование на Java\\Текст1.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException e){
            System.out.println("\nОтловлена ошибка при чтении файла:" + e.getMessage());
        }
    }
}
