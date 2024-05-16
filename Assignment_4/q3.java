 class NullifiedReference {

    private String name;

    NullifiedReference(String name) {
        this.name = name;
    }

  
    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
        super.finalize();
    }

    public static void main(String[] args) {
        NullifiedReference instance = new NullifiedReference("My Instance");

        
        instance = null;

       
        System.gc();
        System.out.println("Garbage Collection invoked");
    }
}
