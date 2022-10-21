package com.github.tel_ran_de.task_1410.task1;

public class Test111 {
    public static void main(String[] args) {
        // Посчитать средний возраст в группе
        int[] years = {42, 27, 35, 29, 51}; // массив возрастов

        testForeach(years);

        testFor(years);

        testWhile(years);
    }

    private static void testWhile(int[] years) {
        double sum = 0; // суммарное количество лет в группе
        int i = 0;
        while (i < years.length) {
            int year = years[i];
            System.out.println((i + 1) + " " + year);
            sum += year; // краткая форма sum =  sum + year;
            i++; // i = i + 1 или i += 1
        }
        System.out.println("[while] Среднее арифмитическое возраста = " + (sum / years.length));
    }

    private static void testFor(int[] years) {
        double sum = 0;
        for (int i = 0; i < years.length; i++) {
            int year = years[i];
            System.out.println((i + 1) + " " + year);
            sum += year;
        }
        System.out.println("[For] Среднее арифмитическое возраста = " + (sum / years.length));
    }

    private static void testForeach(int[] years) {
        double sum = 0; // суммарное количество лет в группе
        for (int year: years) {
            sum += year;
        }
        System.out.println("[Foreach] Среднее арифмитическое возраста = " + (sum / years.length));
    }
}
