import java.util.Scanner;
public class Lab2a2{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter operator(+,-,*,/)");
		String str=sc.nextLine();
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int res;
		if(str.equals("+")){
			 res=a+b;
			System.out.println("result is"+res);
		}else if(str.equals("-")){
			 res=a-b;
			System.out.println("result is"+res);

		}else if(str.equals("*")){
			 res=a*b;
			System.out.println("result is "+res);
		}else{
			res=a/b;
			System.out.println("result is"+res);
		}

	
}
}