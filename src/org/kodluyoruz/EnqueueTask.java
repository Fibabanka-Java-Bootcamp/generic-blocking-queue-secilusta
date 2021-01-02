package org.kodluyoruz;

import java.util.concurrent.Semaphore;

public class EnqueueTask<V> implements Runnable {

    Queue<V> queue;
    V name;
    Semaphore semaphore;

    public EnqueueTask(Queue<V> queue, V name, Semaphore semaphore) {
        this.queue = queue;
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        /*
        //bu kısım test içindi
        if (name == "a"){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Added: " + name);
        queue.Add(name);
        semaphore.release();
    }
}
