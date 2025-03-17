package ru.trofimov.task5;

/**
 * Интерфейс для выполнения функции обратного отсчёта таймера
 */
public interface Task {
    /**
     * Запуск таймера
     */
    void start();

    /**
     * Остановка таймера
     */
    void stop();
}