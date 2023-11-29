package lab16;
import java.util.Scanner;
public class zad8 {
    public static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            boolean validInput = false;

            while (!validInput) {
                String key = myScanner.nextLine();
                try {
                    printDetails(key);
                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.err.println("Поймано исключение: " + e.getMessage());
                    System.err.println("Попробуйте еще раз:");
                }
            }
        }
        public void printDetails(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        private String getDetails(String key) {
            if (key == "") {
                throw new IllegalArgumentException("Key set to empty string");
            }
            return "data for " + key;
        }
    }
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}