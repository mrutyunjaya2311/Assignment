import java.util.*;



class Test {
    public static void main(String[] args) {
        try {
            Num(5);
        } catch (StackOverflowError e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }

    static void Num(int num) throws StackOverflowError {
        Num(num);
    }
}

