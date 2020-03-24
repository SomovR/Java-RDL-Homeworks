package com.homework.taskthree;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void process() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("Element is put in the queue: " + i);
            queue.put(i);
            System.out.println("Queue contains: " + queue.remainingCapacity() + " elements");
            Thread.sleep(new Random().nextInt(500));
        }
    }
}
