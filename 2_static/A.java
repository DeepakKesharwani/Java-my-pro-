class Circle
{
	static float PI = 3.14f;
	float r;

	float areaOfCircle(){
		System.out.println("Area of Circle"+PI*r*r);
		return PI*r*r;
	}

	float perimeterOfCircle(){
		System.out.println("Perimeter of Circle"+2*PI*r);
		return 2*PI*r;

	}

	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.r = 5.12f;
		Circle c2 = new Circle();
		c2.r = 6.12f;

		c1.areaOfCircle();
		c2.areaOfCircle();

		c1.perimeterOfCircle();
		c2.perimeterOfCircle();
	}
}