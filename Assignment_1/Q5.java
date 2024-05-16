class College{
	String collegeName;
	String collegeLoc;
	College(String collegeName,String collegeLoc){
		this.collegeLoc=collegeLoc;
		this.collegeName=collegeName;
	}
}


class Student{

	int studentId;

	String studentName;
	College clg;
	Student(int sId,String sName,College c){
		this.studentId=sId;
		this.studentName=sName;
		this.clg=c;
	}



	void displayStudentInfo() {


		System.out.println("ID is "+studentId+", Student Name"+studentName+", College name:"+clg.collegeName+", College Location:"+c.collegeLoc);
	}
	
}

public class Q5 {
	public static void main(String[] args) {
		College c1=new College("Abc College","Bhubaneswar");
		College c2=new College("Iter College","Bhubaneswar");
		Student s1=new Student(1,"ms",c1);
		Student s2=new Student(2,"js",c2);
		s1.displayStudentInfo();
		s2.displayStudentInfo();
	}
}


