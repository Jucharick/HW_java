// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package Lesson_4;

import java.util.LinkedList;

public class Task_002 {
    private static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {
        System.out.println(isEmpty());
        enqueue(1); // enqueue() - помещает элемент в конец очереди
        enqueue(2);
        enqueue(3);
        enqueue(12);
        enqueue(23);
        enqueue(4);

        System.out.println(size());
        System.out.println(isEmpty());
        System.out.println(first()); // first() - возвращает первый элемент из очереди, не удаляя

        System.out.println(dequeue()); // dequeue() - возвращает первый элемент из очереди и удаляет его
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(list);
    }

    public static void enqueue (int element){
        list.add(element);
    }

    public static int dequeue (){
        return list.removeFirst();
    }

    public static int first (){
        return list.getFirst();
    }

    public static int size (){
        return list.size();
    }

    public static boolean isEmpty (){
        return list.isEmpty();
    }
}
