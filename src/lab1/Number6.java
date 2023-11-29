package lab1;

public class Number6 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += 1./i;
            System.out.printf("%.3f%n", sum);
        }
    }
}
