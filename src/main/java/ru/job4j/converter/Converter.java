package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inForEuro = 140;
        float inForDollar = 120;
        float expected = 2;

        float euro = Converter.rubleToEuro(inForEuro);
        float dollar  = Converter.rubleToDollar(inForDollar);

        boolean passedEuro = expected == euro;
        boolean passedDollar = expected == dollar;

        System.out.println("Euro in 140 rubles are 2. Test result : " + passedEuro);
        System.out.println("Dollars in 120 rubles are 2. Test result : " + passedDollar);
    }
}
