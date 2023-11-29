package lab16;
import java.util.Scanner;
public class zad3 {
    public static class Exception3 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
    }
    public static void main(String[] args) {
        Exception3 exception3 = new Exception3();
        try {
            exception3.exceptionDemo();
        } catch (Exception e) {
            System.out.println("Exception catch");
        }
    }
}
/*
        Шаг 1: при добавлении блока catch, отлавливающее исключение общего типа, программа выдаёт сообщение об ошибке
        в связи с тем, что первый блок catch отлавливает все ошибки и нижние блоки становятся бесполезными.
        Шаг 2: при удалении нижних блоков catch программа в случае любой ошибки будет выдавать сообщение
        "Exception catch"
         */