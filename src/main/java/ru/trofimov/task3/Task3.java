package ru.trofimov.task3;

import java.util.ArrayList;

/**
 * Stream API
 * Отфильтровать сотрудников, оставив только тех, кто старше 30 лет
 */
public class Task3 {
    public static void streamAPI() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nikita", 20, "Разработка", 20000.25));
        employees.add(new Employee("Arina", 29, "Маркетинг", 30000.25));
        employees.add(new Employee("Vlad", 40, "Реклама", 40000.25));
        employees.add(new Employee("Alex", 50, "Финансы", 50000.25));
        employees.add(new Employee("Tom", 60, "Руководтсво", 60000.25));

        employees.stream().filter(employee -> employee.getAge() > 30).forEach(System.out::println);
    }
}