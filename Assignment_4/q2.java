 class ReassigningReference {

    private String name;

    public ReassigningReference(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
        super.finalize();
    }

    public static void main(String[] args) {
        ReassigningReference fi = new ReassigningReference("First Instance");
        ReassigningReference si = new ReassigningReference("Second Instance");

      
        fi = si;

       
        System.gc();
        System.out.println("Garbage Collection invoked");
    }
}
