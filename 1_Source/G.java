class Student2
{
	String name;
	int age;

	public static void main(String[] args){
		Student2 s1 = new Student2();
		s1.name="mohan";
		s1.age=25;

		Student2 s2 = new Student2();
		s2.name = "sohan";
		s2.age=26;
		
		s1.showInfo();
		s2.showInfo();
		
	}
	void showInfo(){
			System.out.println(name);
			System.out.println(age);
	}
}