package lab14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitingLists {
    public interface IWaitList<E> {
        /**
         * Метод добавления элемента в конец списка
         * @param element Добавляемый элемент
         */
        void add(E element);
        /**
         * Метод удаления первого элемента списка
         */
        void remove();
        /**
         * Метод проверки наличия элемента в списке
         * @param element Искомый элемент
         * @return True - если элемент найден, false - если элемент не найден
         */
        boolean contains(E element);
        /**
         * Метод сравнения наличия элементов в двух списках
         * @param c Список, который мы сравниваем со списком в нашем классе
         * @return True - если список c содержит те же элементы, что и список content и false - если нет
         */
        boolean containsAll(ConcurrentLinkedDeque<E> c);
        /**
         * Метод проверки пустоты списка
         * @return True - если список пустой, false - если список не пуст
         */
        boolean IsEmpty();
    }
    public static class WaitList<E> implements IWaitList<E>{
        /**
         * Очередь для списка ожиданий
         */
        protected ConcurrentLinkedDeque<E> content;

        /**
         * Конструктор без параметра
         */
        public WaitList() {
            content = new ConcurrentLinkedDeque<>();
        }

        /**
         * Конструктор с параметром
         * @param c Параметр для инициализации списка
         */
        public WaitList(Collection<E> c){
            content = (ConcurrentLinkedDeque<E>) c;
        }

        /**
         * Метод форматирования вывода на экран списка
         * @return Форматированный вывод
         */
        public String toString() {
            String output = "Элементы списка ожиданий: ";
            for (E element: content) {
                output += element + " ";
            }
            return output;
        }

        /**
         * Метод добавления элемента в конец списка
         * @param element Добавляемый элемент
         */
        @Override
        public void add(E element){
            content.addLast(element);
        }

        /**
         * Метод удаления первого элемента списка
         */
        @Override
        public void remove(){
            content.poll();
        }

        /**
         * Метод проверки наличия элемента в списке
         * @param element Искомый элемент
         * @return True - если элемент найден, false - если нет
         */
        @Override
        public boolean contains(E element){
            for (E e: content) {
                if (e == element) { return true; }
            }
            return false;
        }
        /**
         * Метод сравнения наличия элементов в двух списках
         * @param c Список, который мы сравниваем со списком в нашем классе
         * @return True - если список c содержит те же элементы, что и список content и false - если нет
         */
        @Override
        public boolean containsAll(ConcurrentLinkedDeque<E> c){
            for (E e: content) {
                if (!c.contains(e)) {
                    return false;
                }
            }
            return true;
        }
        /**
         * Метод проверки пустоты списка
         * @return True - если список пустой, false - если список не пуст
         */
        @Override
        public boolean IsEmpty(){
            return content.isEmpty();
        }
    }
    public static class BoundedWaitList<E> extends WaitList {
        /**
         * Переменная, содержащая размер списка
         */
        private final int capacity;
        /**
         * Параметризованный конструктор, создающий список определенной ёмкости
         * @param capacity Ёмкость списка
         */
        public BoundedWaitList(int capacity) {
            this.capacity = capacity;
            content = new ConcurrentLinkedDeque<>();
        }

        /**
         * Метод, возвращающий ёмкость списка
         * @return Ёмкость списка
         */

        public int getCapacity() {
            return this.capacity;
        }

        /**
         * Метод добавления элемента в конец списка
         * @param element Добавляемый элемент
         */
        public void add(Object element){
            if (content.size() >= capacity) {
                return;
            }
            content.addLast(element);
        }

        /**
         * Метод форматирования вывода на экран списка
         * @return Форматированный вывод
         */
        @Override
        public String toString() {
            String output = "Элементы ограниченного списка: ";
            for (Object element: content) {
                output += element + " ";
            }
            return output;
        }
    }
    public static class UnfairWaitList<E> extends WaitList<E> {
        /**
         * Конструктор списка
         */
        public UnfairWaitList(){
            content = new ConcurrentLinkedDeque<>();
        }

        /**
         * Метод удаления элемента списка
         * @param element Удаляемый элемент
         */
        public void remove(E element){
            content.remove(element);
        }

        /**
         * Метод, перемещающий элемент списка в конец
         * @param element Перемещаемый элемент
         */
        public void moveToBack(E element){
            E firstElement = content.pollFirst();
            if (firstElement != null) {
                content.addLast(firstElement);
            }
        }
    }
    public static void main(String[] args) {
        //Проверка методов WaitList
        WaitList<Integer> list = new WaitList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove();
        System.out.println(list.contains(1));
        System.out.println(list);
        ConcurrentLinkedDeque<Integer> list2 = new ConcurrentLinkedDeque<>();
        list2.add(3);
        list2.add(2);
        System.out.println(list.containsAll(list2));
        list.remove();
        list.remove();
        System.out.println(list.IsEmpty());

        //Проверка методов BoundedWaitList
        BoundedWaitList<String> blist = new BoundedWaitList<>(3);
        System.out.println("\n" + blist.getCapacity());
        blist.add("Один");
        blist.add("Два");
        blist.add("Три");
        blist.add("Не добавится");
        System.out.println(blist);

        //Проверка методов UnfairWaitList
        UnfairWaitList<Double> ulist = new UnfairWaitList<>();
        ulist.add(3.765);
        ulist.add(8.235);
        ulist.add(45.6776);
        ulist.add(3.0);
        System.out.println("\n" + ulist);
        ulist.remove(3.0);
        ulist.moveToBack(3.765);
        System.out.println(ulist);
    }
}
