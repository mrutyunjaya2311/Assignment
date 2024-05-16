
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Student_3[] arr = new Student_3[3];
        System.out.println("Enter 3 student detail:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = new Student_3(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        boolean b;
        for (int i = 0; i < 3; i++) {
            b = false;
            for (int j = 0; j < 2 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student_3 temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    b = true;
                }
            }
            if (!b)
                break;
        }


        System.out.println("Sorted in ascending order by Roll No ");
        for (int i = 0; i < 3; i++)
            System.out.println(arr[i]);

    }
}

class Student_3 implements Comparable<Student_3> {
    String name;
    int rn;
    double tm;

    Student_3(String n, int r, double m) {
        this.name = n;
        this.rn = r;
        this.tm = m;
    }

    public int compareTo(Student_3 stu) {
        return this.rn - stu.rn;
    }

    public String toString() {
        return "Name:" + this.name + "\t Roll No.:" + this.rn + "\t Total Marks=" + this.tm;
    }
}

