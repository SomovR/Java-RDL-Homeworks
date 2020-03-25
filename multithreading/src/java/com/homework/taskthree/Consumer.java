package com.homework.taskthree;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                process(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void process (Integer take) throws InterruptedException {
        System.out.println("Element is taken from the queue: " + take);
        Thread.sleep(new Random().nextInt(500));
    }
}