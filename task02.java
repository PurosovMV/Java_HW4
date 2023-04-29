import java.util.*;

/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

public class task02 {
    public static void main(String[] args) {
        System.out.println("enqueue() - помещает элемент в конец очереди");
        enqueue(randomLinkedList(), 123);

        System.out.println("dequeue() - возвращает первый элемент из очереди и удаляет его");
        dequeue(randomLinkedList());

        System.out.println("first() - возвращает первый элемент из очереди, не удаляя");
        first(randomLinkedList());

    }

    static LinkedList<Integer> randomLinkedList() {
        Random random = new Random();
        LinkedList<Integer> rndLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(-100, 100);
            rndLinkedList.addLast(val);
        }
        System.out.println(rndLinkedList);
        return rndLinkedList;
    }

    /* enqueue() - помещает элемент в конец очереди */
    static void enqueue(LinkedList<Integer> list, int n) {
        list.addLast(n);
        System.out.println(list + "\n");
    }

    /* dequeue() - возвращает первый элемент из очереди и удаляет его */
    static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        System.out.println(num);
        System.out.println(list + "\n");
        return num;
    }

    static int first(LinkedList<Integer> list) {
        int num = list.get(0);
        System.out.println(num);
        System.out.println(list);
        return num;

    }
}
