package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(true);

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread((task));
            thread.start();
            thread.join();
        }





    }
}
