package lab16;
import java.util.Scanner;
public class zad4 {
    public static class Exception4 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            try {
                System.out.print("Enter an integer ");
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } finally {
                myScanner.close();
            }
        }
    }
    public static void main(String[] args) {
        Exception4 exception4 = new Exception4();
        try {
            exception4.exceptionDemo();
        } catch (NumberFormatException e) {
            System.out.println("Invalid type");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
/*
    Шаг 2:
    Добавление блока finally к программе позволяет выполнить код в этом блоке независимо от того, возникли исключения
    или нет. При выполнении этой программы, если ввод корректен, она выполнит деление и закроет Scanner. Если возникнет
    исключение NumberFormatException или ArithmeticException, оно будет перехвачено и обработано в соответствующем блоке
    catch, а затем Scanner все равно будет корректно закрыт благодаря блоку finally.
     */
