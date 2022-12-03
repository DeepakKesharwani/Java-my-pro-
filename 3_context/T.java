class T
{
	static int d=87;

	public static void main(String[] args){
		T t = new T();
		t.pro();
	}

	void pro(){
		System.out.println(this.d);
	}
}