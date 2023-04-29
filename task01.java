import java.util.*;

/* Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
Постараться не обращаться к листу по индексам. */

public class task01 {
    public static void main(String[] args) {
        product(randomLinkedList());

    }

    static LinkedList<Integer> randomLinkedList() {
        Random random = new Random();
        LinkedList<Integer> rndLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(-100, 100);
            rndLinkedList.add(val);
        }
        System.out.println(rndLinkedList);

        return rndLinkedList;
    }

    static void product(LinkedList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            System.out.print(list.getLast() + ", ");
            list.removeLast();
        }
    }
}