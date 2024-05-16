 class AnonymousObject {

    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

   
    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
        super.finalize();
    }

    public static void main(String[] args) {
      
        new AnonymousObject("Anonymous Instance");

        
        System.gc();
        System.out.println("Garbage Collection invoked");
    }
}
