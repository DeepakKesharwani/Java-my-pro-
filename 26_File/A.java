import java.io.File;

class A
{
	public static void main(String[] args){
		File f = new File("abc.txt");
		System.out.println(f.exists());
	}
}