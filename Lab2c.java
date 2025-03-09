import java.util.Scanner;
public class Lab2c{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b|| a>=c){
			System.out.println("greater="+a);
		}else if(b>=a || b>=c){
			System.out.println("greater="+b);
		}else{
			System.out.println("greater="+c);
		}
	}
}