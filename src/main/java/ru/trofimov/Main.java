package ru.trofimov;

import ru.trofimov.task1.Task1;
import ru.trofimov.task2.Task2;
import ru.trofimov.task3.Task3;
import ru.trofimov.task4.Task4;
import ru.trofimov.task5.Task5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Task1.findMaxElementInMassive();
        System.out.println("\nЗадача 2");
        Task2.sort();
        System.out.println("\nЗадача 3");
        Task3.streamAPI();
        System.out.println("\nЗадача 4");
        Task4.httpJson();
        System.out.println("\nЗадача 5");
        Task5.timer();
    }
}
