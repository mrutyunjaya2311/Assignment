import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 10, 8, 7, 3, 4, 6, 5, 9 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }
        System.out.print("Priority Queue dequeue: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");

        }
    }
}
