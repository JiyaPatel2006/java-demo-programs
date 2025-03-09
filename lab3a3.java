import java.util.Scanner;
public class lab3a3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("max="+max);
	}
}
