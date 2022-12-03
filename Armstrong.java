import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args){
		Scanner cs = new Scanner(System.in);
		int n = cs.nextInt();
		int sum = 0;
		int temp = n;
		while(n>0){
			int r = n%10;
			 sum = sum+(r*r*r);
			n = n/10;
		}
		if(temp == sum){
			System.out.println("No is armstrong");
		}else{
			System.out.println("No is not armstrong");
		}
	}
}