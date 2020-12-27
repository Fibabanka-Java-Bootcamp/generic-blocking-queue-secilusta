package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue<String>();
        queue.Add("a");
        queue.Add(  "b");
        queue.Add("c");
        queue.printQueue();
        System.out.println("");

        System.out.println(queue.Poll());
        System.out.println(queue.Poll());
        System.out.println(queue.Poll());
        System.out.println(queue.Poll());
        System.out.println(queue.Peek());
        System.out.println(queue.Peek());

        System.out.println("------");

        Queue queue2 = new Queue<Number>();
        queue2.Add(1);
        queue2.Add(  2);
        queue2.Add(3);
        queue2.printQueue();
        System.out.println("");

        System.out.println(queue2.Poll());
        System.out.println(queue2.Poll());
        System.out.println(queue2.Poll());
        System.out.println(queue2.Poll());
        System.out.println(queue2.Peek());
        System.out.println(queue2.Peek());

    }
}
