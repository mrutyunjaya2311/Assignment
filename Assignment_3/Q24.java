
import java.io.*;
import java.io.FileNotFoundException;

class Test {

    
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\hp\\Desktop\\2241013365\\csw2\\Assignment_3\\abc1.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
