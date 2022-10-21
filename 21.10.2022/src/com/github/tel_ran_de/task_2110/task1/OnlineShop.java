package com.github.tel_ran_de.task_2110.task1;

//Задача на приведение типов:
//
//Итак мы разрабатываем онлайн магазин, где пользователь может ввести
//
//1. количество товаров
//
//2. цену товару в евро
//
//
//И мы посчитаем ему стоимость добавив 20% VAT. Потом вернем ему только сумму в евро.
// Для экономии памяти нужно хранить цену в типе Integer.
//
//
//
//Вам нужно реализовать пользователь сначала вводит целое число с клавиатуры
// (количество товара), потом дробное число (цену товара), после этого результат вы
// умножаете на 120% (добавляете VAT), округляете до целых с округлением вверх (то есть всегда к большему),
// сохраняете в Integer и уже выводите на экран.
//
//
//Подсказка: можно использовать класс Scanner и методы scanner.nextInt(), scanner.nextDouble() для ввода чисел и Math.round
//
//
//Дополнительная сложность (для продвинутых):
//
//
//1. Сделать возможность ввода нескольких групп разных товаров и показывать итоговую сумму (можно реализовать либо спросив пользователя сколько групп товаров он хочет ввести и потом сделать цикл по каждой группе, либо спрашивая после ввода товаров одной группы хочет ли он продолжить дальше Y/N). Показать итоговую сумму по всех товарам.
//
//
//2. Добавить проверки, что в результате у нас не будет переполнения значений переменной Integer.
//
//
//
//


import java.util.Scanner;

public class OnlineShop {
    private static int countGroup;
    private static int countGoods;
    private static double price;
    private static int total;

    private static int getResult(int countGoods, double price) {
        int result = (int) Math.round((countGoods * price) * 120 / 100);
        return  result;
    }

    public static long checkInt(Scanner input) {
        if (input.hasNextInt()) {
            return (int) input.nextInt();
        } else {
            System.out.println("Значение больше 2147483647, обнуляем");
            return input.nextLong();
        }
    }
    private static void InputProcessing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество групп товаров, целое число: ");
        countGroup = scanner.nextInt();
        System.out.println("Вывод группы товаров №" + countGroup);
        for (int i = 0; i < countGroup; i++) {
            System.out.println("Введите количество товаров, целое число: ");
            countGoods = (int) checkInt(scanner);
            System.out.println(countGoods);

            System.out.println("Введите цену товара, запятая для центов: ");
            price = scanner.nextDouble();
            int result = getResult(countGoods, price);
            System.out.println("Сумма в целых евро: " + result);
            total += result;
        }
        System.out.println("Общий счет: " + total);

    }

    public static void main(String[] args) {
        InputProcessing();
    }

}