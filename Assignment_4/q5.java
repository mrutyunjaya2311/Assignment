 class DataClass {
    private int intValue;
    private double doubleValue;

 
    public DataClass(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

   
    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    
    public void displayValues() {
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
    }
}

public class MemoryManagement {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

       
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total memory before creating objects: " + memoryBefore);

        
        DataClass obj1 = new DataClass(10, 20.5);
        DataClass obj2 = new DataClass(30, 40.5);

      
        obj1.setIntValue(100);
        obj1.setDoubleValue(200.5);
        obj2.setIntValue(300);
        obj2.setDoubleValue(400.5);

        
        obj1.displayValues();
        obj2.displayValues();

        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total memory after creating objects: " + memoryAfter);
        obj1 = null;
        obj2 = null;
        System.gc(); 

        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      
        long memoryAfterGC = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total memory after garbage collection: " + memoryAfterGC);
    }
}
