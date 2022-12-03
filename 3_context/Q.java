class X
{
	X(int w){
		System.out.println(w);
	}
}

class Q extends X
{
	static int x = 56;
	Q(){
		super(x);
		System.out.println(x);
	}

	public static void main(String[] args){
		Q q = new Q();
	}

}