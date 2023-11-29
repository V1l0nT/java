package lab6;

public class QuickSort {
    // Метод для выполнения быстрой сортировки
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // Находим индекс опорного элемента (позицию, на которой элемент должен стоять в отсортированном массиве)
            int partitionIndex = partition(arr, left, right);

            // Рекурсивно сортируем элементы слева и справа от опорного элемента
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    // Метод для разделения массива на две части
    private static int partition(int[] arr, int left, int right) {
        // Выбираем опорный элемент (обычно последний элемент массива)
        int pivot = arr[right];

        // Индекс элемента, который меньше или равен опорному элементу
        int i = left - 1;

        for (int j = left; j < right; j++) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println(" " + i + " " + j + " " + pivot + "\n");
            // Если текущий элемент меньше или равен опорному, меняем местами элементы
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Помещаем опорный элемент в правильную позицию
        swap(arr, i + 1, right);
        // Возвращаем индекс опорного элемента
        return i + 1;
    }

    // Метод для обмена двух элементов в массиве
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};

        // Вызываем метод быстрой сортировки
        quickSort(arr, 0, arr.length - 1);

        // Выводим отсортированный массив
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
