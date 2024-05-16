 class UnreachableObject {

    private String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public void show() {
        UnreachableObject object = new UnreachableObject("Show Object");
        object.display();
    }

    public void display() {
        UnreachableObject anotherObject = new UnreachableObject("Display Object");
        
    }


    protected void finalize() throws Throwable {
        System.out.println(this.name + " successfully garbage collected");
        super.finalize();
    }

    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("Main Object");
        obj.show();
        
        System.gc();
        System.out.println("done");
    }
}
