
import java.util.HashMap;
import java.util.Scanner;





class Book {
    long id;
    String name;
    String author;
    int q;

    Book(long id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.q = quantity;
    }

    public String toString() {
        return "Id : " + id + "Name : " + name + "Author : " + author + "\tQuantity : " + q + "\n";
    }
}





public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> ob = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        ob.put(1, new Book(224, "csw", "Mayur Ramgir", 100));



        ob.put(2, new Book(243, "ad", "dj", 150));
        System.out.println(ob);
        System.out.print("Enter book name :");
        String s = sc.next();
        for (Book book : ob.values()) {
            if (book.name.equalsIgnoreCase(s)) {
                System.out.println(s + "  is present  in the library.");
                break;
            }
        }
        System.out.print("Enter key to remove:");
        int k = sc.nextInt();
        ob.remove(k);
        System.out.println("After removing--\n" + ob);
    }
}



