import java.util.*;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = null;
        try {
            System.out.println(n + 2);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}
