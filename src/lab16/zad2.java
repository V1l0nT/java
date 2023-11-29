package lab16;
import java.util.Scanner;
public class zad2 {
    public static class Exception2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
    }
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        try {
            exception2.exceptionDemo();
        } catch (NumberFormatException e) {
            System.out.println("Invalid type");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
/* Шаг 2:
    Если пользователь вводит "Qwerty", то при попытке преобразования этой строки в целое число возникнет исключение
    NumberFormatException, так как "Qwerty" не может быть преобразовано в целое число.
    Если пользователь вводит "0", то программа выполнит деление на ноль и вызовет исключение ArithmeticException,
    так как деление на ноль запрещено.
    Если пользователь вводит "1.2", то снова возникнет исключение NumberFormatException, так как "1.2" не является
    целым числом и не может быть преобразовано с помощью Integer.parseInt
    Шаг 3:
    При запуске данной программы пользователь получит сообщение об ошибке "Invalid type" и считает лишь первое слово из
    строки*/
