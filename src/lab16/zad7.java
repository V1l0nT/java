package lab16;
import java.util.Scanner;
public class zad7 {
    public static class ThrowsDemo {
        public void getKey() throws Exception {
            Scanner myScanner = new Scanner( System.in );
            String key = myScanner.nextLine();
            printDetails( key );
        }
        public void printDetails(String key) throws Exception{
            try { String message = getDetails(key);
                System.out.println( message );
            } catch (Exception e) {
                throw e;
            }
        }
        private String getDetails(String key) throws Exception{
            if(key == "") {
                throw new Exception( "Key set to empty string" );
            }
            return "data for " + key; }
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
/*
    Шаг 1:
    Вывод программы: java: unreported exception java.lang.Exception; must be caught or declared to be thrown
    Причиной полученной ошибки является выражение throw е. В данном случае метод printDetails () решил, что он не может
    иметь дело с исключением и проходит все дерево его вызовов. Поскольку метод getKey() не имеет блока try-catch
    для обработки исключений, то Java становится перед выбором, что в таком случае делать. Проблему можно решить
    несколькими способами:
    1. Добавьте соответствующие try-catch блоки таким образом, чтобы в конечном итоге один из них обрабатывал
    исключение;
    2. Удалите блоки try-catch для всех методов, кроме одного, который обрабатывает исключение. Добавьте throws,
    который бросает исключение методу и проходит исключение без обработки.
     */
