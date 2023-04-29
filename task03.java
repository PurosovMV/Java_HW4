import java.util.*;

/* Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */
public class task03 {
    public static void main(String[] args) {
        sumElements(randomLinkedList());

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

    static void sumElements(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println(sum);
    }

}
