package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] row : array) {
            for (int number : row) {
                result += number;
            }
        }
        return result;
    }
}
