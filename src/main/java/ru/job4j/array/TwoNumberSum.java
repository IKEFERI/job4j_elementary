package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            int sum = array[l] + array[r];
            if (target == sum) {
                return new int[]{l, r};
            }
            if (target > sum) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}
