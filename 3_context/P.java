class X
{
	X(int w){
		System.out.println(w);
	}
}

class P extends X
{
	int x = 56;
	P(){
		super(x);
		System.out.println(x);
	}

	public static void main(String[] args){
		P p = new P();
	}

}