import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 class MemoryIntensiveProgram {

    public static void main(String[] args) {
        
        System.out.println("Using G1 Garbage Collector");

        
        Runtime runtime = Runtime.getRuntime();

        
        List<Object> objects = new ArrayList<>();

       
        printMemoryUsage(runtime);

        try {
         
            while (true) {
                objects.add(new Object());

               
                if (objects.size() % 10000 == 0) {
                    printMemoryUsage(runtime);
                }
            }
        } catch (OutOfMemoryError e) {
           
            System.out.println("Caught OutOfMemoryError");
            printMemoryUsage(runtime);
        }
    }

    private static void printMemoryUsage(Runtime runtime) {
        long heapSize = runtime.totalMemory();
        long heapFreeSize = runtime.freeMemory();
        System.out.println("Timestamp: " + new Date());
        System.out.println("Heap Size: " + heapSize + " bytes");
        System.out.println("Heap Free Size: " + heapFreeSize + " bytes");
    }
}
