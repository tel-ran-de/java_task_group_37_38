package com.github.tel_ran_de.task_1410.task1;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш рост в см (дробные числа): ");
        double lengthInSm = in.nextDouble();
        int lengthInMM = (int) Math.round(lengthInSm * 100);
        System.out.println("Ваш рост в мм " + lengthInMM);
        if(lengthInMM > 20000) {
            System.out.println("Вы очень высокий! ");
        }

    }
}
