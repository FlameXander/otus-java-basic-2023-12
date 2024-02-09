package ru.otus.java.basic.lesson9;

public class App {
    public static void main(String[] args) {

    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isPointExists(int[] in) {
        // 1 2 3 2 1 7
        // sum = 16
        // leftSum = 8
        int sum = 0;
        for (int i = 0; i < in.length; i++) {
            sum += in[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int leftSum = 0;
        for (int i = 0; i < in.length; i++) {
            leftSum += in[i];
            if (leftSum * 2 == sum) {
                return true;
            }
        }
        return false;
    }
}
