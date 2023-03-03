package assignment.studentgpa;

class StudentTest {
	private String name;
	private int age;
	private double gpa;
	StudentTest(String name,int age,double gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}
     String getname(){
		return name;
	}
	public int getage() {
		return age;
	}
	public double getgpa() {
		return gpa;
	}
}
