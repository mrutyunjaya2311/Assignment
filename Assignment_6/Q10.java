import java.io.File;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String mainDir = sc.nextLine();
        File file = new File(mainDir);
        listFiles(file);
    }

    
    public static void listFiles(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            System.out.println(file.getName() + " (Directory)");
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listFiles(f);
                }
            }
        }
    }
}

