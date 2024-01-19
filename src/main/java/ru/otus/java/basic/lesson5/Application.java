package ru.otus.java.basic.lesson5;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        doSomethingWithArray(arr1);
        doSomethingWithArray(new int[]{2, 2, 2});
        doSomethingWithArrayVararg(1, 2, 3, 4, 5);
        doSomethingWithArrayVararg(1, arr1);
    }

    public static void doSomethingWithArray(int[] arr) {
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
    }

    public static void doSomethingWithArrayVararg(int x, int... arr) {
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
    }

    private static void compareArrays() {
        // * Сверить два массива, и посчитать сколько элементов в них имеют одно значение и стоят на одном и том же месте.
        //        Пример: { 1 2 3 4 5 6 } { 1 4 4 4 0 6 } => 3 элемента
        //        Посчитать сумму элементов трех массивов
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        int[] arr2 = {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        int counter = 0;
        for (int i = 0; i < Integer.min(arr.length, arr2.length); i++) {
            if (arr[i] == arr2[i]) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(counter);
    }

    private static void printArrays() {
        //        Как распечатать массив в консоль?
        //          через готовый метод
        //          через цикл
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 2, 3, 5, 6, 8};
        System.out.println(Arrays.toString(arr));
        System.out.print("{ ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + " }");
    }

    private static void incrementEvenPositionElements() {
        // Как увеличить элементы на четных позициях на 1
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 2, 3, 5, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i]++;
            }
        }
        for (int i = 0; i < arr.length; i += 2) {
            arr[i]++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void zerifyElements() {
        // Как занулить определенные элементы массива
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 2, 3, 5, 6, 8};
//        // Зануление "по значению"
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 2 || arr[i] == 4) {
//                arr[i] = 0;
//            }
//        }
        // Зануление "по адресу"
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void hardCase1() {
        // * количество ячеек, в которых следующим элементом идет число на 1 больше.
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 2, 3, 5, 6, 8};
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);
    }

    private static void countElements() {
        //        Как посчитать количество элементов массива, удовлетворяющих условию?
        //          количество четных чисел
        //          количество положительных чисел
        int[] arr = {1, -1, 1, 1, -1, 1, 1, 2, 2, 2, 2, 2};
        int evenNumbersCount = 0;
        int positiveNumbersCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveNumbersCount++;
            }
            if (arr[i] % 2 == 0) {
                evenNumbersCount++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("positiveNumbersCount = " + positiveNumbersCount);
        System.out.println("evenNumbersCount = " + evenNumbersCount);
    }

    private static void fillArrayHalfByHalf() {
        // Как заполнить половину массива?
        //   левую
        //   правую
        int[] arr = new int[10];
        // 0 1 2 3 4 5 6 7 8 9
        // 1 1 1 1 1 2 2 2 2 2
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = 1;
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void sumArray() {
        // Как посчитать сумму элементов массива?
        int[] arr = {2, 5, 2, 4, 1, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    // Как заполнить все ячейки массива определенным значением?
    private static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100;
        }
        System.out.println(Arrays.toString(arr));
    }
}