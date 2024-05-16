import java.lang.ClassNotFoundException;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Method;

class Test {
    public static void main(String[] args) {

        
        try {
            Class.forName("Q30");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }




        try {
            Method m = Q26.class.getMethod("disp", String[].class);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }
    }
}
