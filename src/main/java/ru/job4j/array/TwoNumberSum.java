package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[j] + array[i] == target) {
                return new int[]{i, j};
            }
            if (j == array.length - 1) {
                i++;
                j = i;
            }
            j++;
        }
        return new int[0];
    }
}
