import java.util.Scanner ;

class Test {
    public static void main(String[] args) {
        System.gc();
        String s = new String("Hello");
        System.out.println("" + Runtime.getRuntime().freeMemory());
        String s3 = new String("Hello");
        System.gc();
        String s1 = "Hello";
        System.out.println(" " + Runtime.getRuntime().freeMemory());
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s == s1);
        System.out.println(s == s3);
    }
}

