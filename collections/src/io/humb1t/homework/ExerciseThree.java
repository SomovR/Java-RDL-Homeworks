package io.humb1t.homework;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ExerciseThree {


    public static void main(String[] args) {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("request 1");
        queue.add("request 2");
        queue.add("request 3");
        QueueThread thread1 = new QueueThread(queue, "thread 1");
        QueueThread thread2 = new QueueThread(queue, "thread 2");
        QueueThread thread3 = new QueueThread(queue, "thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class QueueThread extends Thread {
        Queue queue;
        String threadName;

        QueueThread(Queue queue, String threadName) {
            this.queue = queue;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            while (!queue.isEmpty()) {
                System.out.println(threadName + " " + queue.poll());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }


    }

}
