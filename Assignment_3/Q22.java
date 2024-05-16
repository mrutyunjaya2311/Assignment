import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new CustomCheckedException("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        } catch (CustomCheckedException e) {
            System.out.println(e);
        }
    }
}

class CustomCheckedException extends Exception {
    CustomCheckedException(String e) {
        super(e);
    }
}
