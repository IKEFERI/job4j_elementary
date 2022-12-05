package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && notPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int checkNumber = 3;
        System.out.println("Properties of number 3: ");
        System.out.println("isEven - " + isEven(checkNumber));
        System.out.println("isPositive - " + isPositive(checkNumber));
        System.out.println("notEven - " + notEven(checkNumber));
        System.out.println("notPositive - " + notPositive(checkNumber));
        System.out.println("notEvenAndPositive - " + notEvenAndPositive(checkNumber));
        System.out.println("evenOrNotPositive - " + evenOrNotPositive(checkNumber));
    }
}
