package ru.raccooncoparation.geekbrains.java3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWorkLesson1 {
    /**
     * Метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
     */
    public static <T> void swap(T[] arr, int a1, int a2) {
        System.out.println("Вид массива первоначальны " + Arrays.toString(arr));
        T move = arr[a1];
        arr[a1] = arr[a1];
        arr[a2] = move;
        System.out.println("Перобразованный массив " + Arrays.toString(arr));
    }

    public static <T> ArrayList<T> arrToArrayList(T[] arr) {
       // метод, который преобразует массив в ArrayList<T>
        return new ArrayList<T>(Arrays.asList(arr)); // метод, который преобразует массив в ArrayList<T>
    }
}
