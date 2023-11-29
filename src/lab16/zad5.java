package lab16;

public class zad5 {
    public static class ThrowsDemo {
        public void printMessage(String key) {
            String message = getDetails(key); System.out.println(message);
        }
        public String getDetails(String key) {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for" + key;
        }
    }
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.getDetails(null); // Передаем null в качестве аргумента
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
    }
}
/*
    Шаг 1:
    Вывод программы: java.lang.NullPointerException: null key in getDetails at
    ThrowsDemo.getDetails(ThrowsDemo.java:13)
    Шаг 2:
    Причиной ошибки, может является, например неправильное
    значение для параметра. Было бы лучше, если бы метод вызывал
    getDetails() и там решалась бы эта проблема.
     */
