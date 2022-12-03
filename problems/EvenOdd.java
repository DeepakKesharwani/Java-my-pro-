import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args){
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer:");
		x = sc.nextInt();
		if(x%2==0){
			System.out.println("Number is Even");
		}else{
			System.out.println("Number is Odd");
		}
	}
}