package ru.trofimov.task5;

/**
 * Реализация интерфейса “Task”
 * Выполнение функции обратного отсчёта таймера
 */
public class Task5 {
    public static void timer() {
        Task timer = new Task() {
            private int initialTime = 60;
            private boolean isRunning = false;
            private Thread thread;

            @Override
            public void start() {
                if (!isRunning) {
                    isRunning = true;
                    thread = new Thread(() -> {
                        while (isRunning && (initialTime > 0)) {
                            System.out.println("Осталось: " + initialTime + " сек");
                            initialTime--;

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                System.out.println("Таймер остановлен");
                                break;
                            }
                        }
                        if (initialTime == 0) {
                            System.out.println("Время вышло");
                        }
                    });
                    thread.start();
                }
            }

            @Override
            public void stop() {
                isRunning = false;
                thread.interrupt();
            }
        };

        timer.start();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        timer.stop();
    }
}