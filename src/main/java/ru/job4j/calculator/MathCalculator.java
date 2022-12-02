package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivide(double first, double second) {
        return diff(first, second)
                + divide(first, second);
    }

    public static double allOperationSum(double first, double second) {
        return diff(first, second)
                + divide(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат суммы операций сложения и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы операций вычитания и деления равен: " + diffAndDivide(10, 20));
        System.out.println("Результат суммы всех операций: " + allOperationSum(10, 20));
    }
}
