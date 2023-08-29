package com.company;

public class Task implements Runnable {

    public static int counter = 0;
    private boolean isIncrement;
    public static final Object o = new Object();

    public Task(boolean b) {
        this.isIncrement = b;
    }


    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                increment();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void decrement() throws InterruptedException {
        synchronized (o) {
            counter--;
            wait();
            notify();


        }
    }

    private void increment() throws InterruptedException {
        synchronized (o) {
            counter++;
            System.out.println(counter);
            wait();
            notify();


        }


    }

}
