class Student1
{
	int age;
	final float maxAge=23;
	String maxAgeInfo;
	void  studentInformationProcess(){
		System.out.println(age);
	}

	public static void main(String[] args){
		Student1 s1 = new Student1();
		s1.age = 20;

		Student1 s2 = new Student1();
		s2.age = 21;

		s1.studentInformationProcess();
		s2.studentInformationProcess();

	}
}