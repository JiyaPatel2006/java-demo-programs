import java.util.Scanner;
public class Lab2a3{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int length=sc.nextInt();
		System.out.println("enter breadth");
		int breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println("area="+area);
	}
}