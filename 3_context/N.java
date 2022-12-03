class N
{
	//static int z=98;
	int z=98;//not ok
	static{
		System.out.println(z);
	}

	public static void main(String[] args){
		N n = new N();
	}
}