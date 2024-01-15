package area;

public class Triangle
{
	public float triangleArea(int b,int h)
	{
		return(0.5f*b*h);
	}
}

package area;

public class Square
{
	public int SquareArea(int s)
	{
		return(s*s);
	}
}

package area;

public class Rectangle
{
	public int rectangleArea(int l,int b)
	{
		return(l*b);
	}
}

package area.*;

class AreaDemo
{
	public static void main(String args[])
	{

		int r=Integer.parseInt(args[0]);
		circle A=new Circle();
		Rectangle B=new Rectangle();
		Triangle C=new Triangle();
		Square D=new Square();

		float ca=A.circleArea(r);
		System.out.println("Area of Circle="+ca);

		float ra=B.rectangleArea(10,20);
		System.out.println("Area of rectangle="+ra);

		float ta=C.triangleArea(10,20);
		System.out.println("Area of Triangle="+ta);

		float sa=D.squareArea(10);
		System.out.println("Area of square="+sa);
	}
}