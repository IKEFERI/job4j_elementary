package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean reference = data[0];
        for (boolean element : data) {
            if (element != reference) {
                result = false;
                break;
            }
        }
        return result;
    }
}
