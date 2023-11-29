package lab16;
public class zad6 {
    public static class ThrowsDemo {
        public void printMessage(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (IllegalArgumentException e) {
                System.out.println("Поймано исключение в printMessage: " + e.getMessage());
            }
        }
        public String getDetails(String key) {
            if(key == null) {
                throw new IllegalArgumentException("null key in getDetails");
            }
            return "data for " + key;
        }
    }
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.printMessage("correct");
        //try {
            demo.printMessage(null);
        /*} catch (IllegalArgumentException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }*/
    }
}
/*
    Шаг 1:
    При запуске программы с ненулевым ключом программа отработает нормально и не выведет никакой ошибки.
    Если ключ является значением null, то программа перехватит исключение и выведет данный текст: Исключение
    перехвачено: java.lang.NullPointerException: null key in getDetails.
    Шаг 2:
    Чтобы избежать возникновения исключения NullPointerException, программа предварительно проверяет значение ключа
    на null в методе getDetails и обрабатывать его соответствующим образом. Поэтому при изменении программы с правильным
    ключом будет выведено значение "data for correct", а со значением null будет перехвачено исключение и выведено
    сообщение "Исключение перехвачено: null key in getDetails".
    Шаг 3:
    Для избежания "поломки" программы добавим блок try...catch к методу printMessage дабы не пришлось отлавливать ошибку
    непосредственно в блоке main. Таким образом, ошибка будет отлавливаться в самом методе.
     */
