import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer ob = new StringBuffer();

        while (true) {
           
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Append string: ");
                    ob.append(sc.next());
                    System.out.println("After append:" + ob);
                    break;
                case 2:
                    System.out.print("Insert Index and string: ");
                    ob.insert(sc.nextInt(), sc.next());
                    System.out.println("After insert:" + ob);
                    break;
                case 3:
                    System.out.print("Delete from Index1 to Index2: ");
                    ob.delete(sc.nextInt(), sc.nextInt());
                    System.out.println("After delete:" + ob);

                    break;
                case 4:
                    System.out.println(":" + ob.reverse());
                    break;
                case 5:
                    System.out.print("Enter string:");
                    String s = sc.next();
                    System.out.print("Enter range:");
                    ob.replace(sc.nextInt(), sc.nextInt(), s);
                    System.out.println("After replace:" + ob);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
