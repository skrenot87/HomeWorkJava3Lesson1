import java.util.ArrayList;
import java.util.Arrays;

public class homeWorkLesson1 {
    /*
     *
     * Метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
     *
     */
    public static void moveItems(Object[] arr, int a1, int a2) {
        System.out.println("Вид массива первоначальны " + Arrays.toString(arr));
        Object move = arr[a1];
        arr[a1] = arr[a1];
        arr[a2] = move;
        System.out.println("Перобразованный массив " + Arrays.toString(arr));
    }

    /*
     *   Написать метод, который преобразует массив в ArrayList<T>;
     *
     */

    public static <T> ArrayList<T> arrToArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
