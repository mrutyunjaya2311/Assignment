
import java.io.*;
import java.util.*;


class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to be deleted: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("An error occurred while deleting the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
