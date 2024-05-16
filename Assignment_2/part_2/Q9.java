import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> rpt = new HashSet<>();
        for (int i : arr) {
            if (hs.contains(i)) {
                rpt.add(i);
            }
            hs.add(i);
        }
        System.out.println(rpt + " are repeated numbers.");
    }
}

