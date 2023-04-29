import java.util.LinkedList;

/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

public class MayQueue {
    private LinkedList<Integer> list = new LinkedList<>();

    void enqueue(int item) {
        list.add(item);
    }

    int dequeue() {
        return list.remove(0);
    }

    int first() {
        return list.get(0);
    }

}
