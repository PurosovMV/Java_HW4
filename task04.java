import java.util.List;

public class task04 {
    public static void main(String[] args) {

        MayQueue queue = new MayQueue();
        queue.enqueue(2);
        queue.enqueue(55);
        queue.enqueue(6);
        queue.enqueue(556);
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
    }

}
