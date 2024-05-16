import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.next());
            try {
                if (n == 0) {
                    throw new ArithmeticException("Division by zero error");
                }
                System.out.println(1 / n);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}

