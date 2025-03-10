package ru.trofimov.task1;

import java.util.Random;

/**
 * Работа с массивом.
 * Заполнить массив (тип элементов “int”) случайными числами.
 * Найти максимальное значение по модулю в массиве.
 */
public class Task1 {
    public static void findMaxElementInMassive() {
        Random rand = new Random();
        int n = rand.nextInt(100);
        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(-100, 100);
        }
        int max = 0;
        for (int i : mass) {
            if (Math.abs(i) > max) {
                max = Math.abs(i);
            }
        }
        System.out.println("Созданный массив");
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println("\nМаксимальный элемент по модулю: " + max);
    }
}