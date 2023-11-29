package lab16;

public class zad1 {
    public static class Exception1 {
        public void exceptionDemo() {
            try {
                System.out.println(2 / 0);
            } catch ( ArithmeticException e ) {
                System.out.println("Attempted division by zero");
            }
        }
    }
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
    }
}
/* Шаг 1: программа даст сбой, и мы получаем следующее сообщение
        java.lang.ArithmeticException: / by zero at Exception1.exceptionDemo(Exception1.java:12)
        Это говорит нам о том, что программа пытается выполнить деление на ноль, который он не в состоянии выполнить.
        Шаг 2: при замене 2 и 0 на 2.0 и 0.0 произойдёт деление чисел типа double, поэтому результатом
        вычисления будет infinity
        Шаг 3: при добавлении блока try...catch для отлавливания ошибки на экран выводится сообщение
        "Attempted division by zero"*/
