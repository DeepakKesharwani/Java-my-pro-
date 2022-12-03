class X{
	int w= 45;
}

class V extends X
{
	int w=90;

	V(){
	
	}

	public static void main(String[] args){
		V v = new V();
		v.pro();
	}
	void pro(){
		int w=61;
		System.out.println(w);
		System.out.println(this.w);
		System.out.println(super.w);
	}
}