class Student {
    private String name;
    private int studentId;
    private List<String> courses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        courses.add(course);
        System.out.println(name + " has enrolled in " + course);
    }

    public void dropCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(name + " has dropped " + course);
        } else {
            System.out.println(name + " is not enrolled in " + course);
        }
    }

    
    protected void finalize() throws Throwable {
        System.out.println("Student " + name + " with ID " + studentId + " is being garbage collected");
        super.finalize();
    }
}

 class UniversityEnrollment {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        
        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Initial Memory Usage: " + initialMemory + " bytes");

       
        Student student1 = new Student("John Doe", 1001);
        student1.enrollCourse("Computer Science 101");
        student1.enrollCourse("Mathematics 101");

       
        student1.dropCourse("Mathematics 101");

       
        student1 = null;

       
        System.gc();

        
        long memoryAfterGC = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory Usage after GC: " + memoryAfterGC + " bytes");
    }
}
