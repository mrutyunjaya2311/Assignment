
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        while (true) {
            System.out.println("1. Convert to Lowercase" + "2. Convert to Uppercase" + "3. Search for a character"
                    + " Concatenate with another string" + " Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Lowercase: " + s.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase: " + s.toUpperCase());
                    break;
                case 3:
                    System.out.println("Enter the character to search:");
                    char c = sc.next().charAt(0);
                    System.out.println("First occurrence of " + c + " is at index " + s.indexOf(c));
                    break;
                case 4:
                    System.out.println("Enter the string to concatenate:");
                    String s2 = sc.next();
                    System.out.println("Concatenated String: " + s.concat(s2));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

