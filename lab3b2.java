import java.util.Scanner;
public class lab3b2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int reverse=0,remainder;
		while(n>0){
			remainder=n%10;
			reverse=reverse*10+remainder;
			n/=10;
		}
		if(reverse==0 && n==reverse){
			System.out.println("palimdrom");
		}else{
			System.out.println("not palimdrom");
		}



	}
}