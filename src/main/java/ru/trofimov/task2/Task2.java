package ru.trofimov.task2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Заполнить список (тип “ArrayList<Double>”) случайными числами и отсортировать его
 * Вид сортировки: MergeSort
 */

public class Task2 {
    public static void sort() {
        ArrayList<Double> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(rand.nextDouble() * 100);
        }

        System.out.println("Начальный список: " + list);
        System.out.println("Отсортированый список: " + mergeSort(list));
    }

    public static ArrayList<Double> merge(ArrayList<Double> firstPart, ArrayList<Double> secondPart) {
        ArrayList<Double> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < firstPart.size() && j < secondPart.size()) {
            if (firstPart.get(i) < secondPart.get(j)) {
                result.add(firstPart.get(i));
                i++;
            } else {
                result.add(secondPart.get(j));
                j++;
            }
        }

        while (i < firstPart.size()) {
            result.add(firstPart.get(i));
            i++;
        }

        while (j < secondPart.size()) {
            result.add(secondPart.get(j));
            j++;
        }
        return result;
    }

    public static ArrayList<Double> mergeSort(ArrayList<Double> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        ArrayList<Double> firstPart = new ArrayList<>(list.subList(0, mid));
        ArrayList<Double> secondPart = new ArrayList<>(list.subList(mid, list.size()));

        firstPart = mergeSort(firstPart);
        secondPart = mergeSort(secondPart);

        return merge(firstPart, secondPart);
    }
}