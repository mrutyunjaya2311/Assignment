
import java.io.File;

class Test {
    public static void main(String[] args) {

        File file = new File("Data/diary.txt");
        File rename = new File("Data/diary2.txt");
        boolean flag = file.renameTo(rename);

        if (flag == true) {
            System.out.println("File Successfully Rename");
        } else {
            System.out.println("Operation Failed");
        }
    }
}
