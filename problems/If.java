import java.util.Scanner;
class If
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
		if(x%2==0){
			System.out.println("No is even");
		}else{
			System.out.println("No is odd");
		}
	}
}