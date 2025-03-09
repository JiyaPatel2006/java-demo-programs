import java.util.Scanner;

class circle{
	double radius;

public circle(double radius){
	this.radius=radius;
}

public double area(){
	double area;
	area=radius*radius*3.14;
	return area;
}
}

public class lab6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		double radius=sc.nextDouble();

		circle r=new circle(radius);
		double a=r.area();
		System.out.println(a);
	}
}